# R2-Q2: 188,888 vending machines, sab midnight pe report, 1 AM pe batch job

**Source:** Round 2, system-design discussion. **Pehle khud problems nikalo.**

## Question
~188,888 internet-connected vending machines (cellular). Har machine midnight pe central server ko stock + maintenance issues (coin jam, stuck item) report karti hai. Updates database me store hote hain; 1 AM pe batch job restocking/maintenance schedule karta hai. Design me koi problem? Kaise solve karoge?

## Model answer (spoiler)
**Problems**
1. **Thundering herd:** sab machines ek hi time pe connect => ek second me ~1.9 lakh requests; server aur DB overload / timeouts. (Agar 1 ghante me spread ho to sirf ~52 req/s.)
2. **Fixed midnight:** time zones / clock drift; kaun sa midnight? Server time ya local?
3. **Late / missing reports:** cellular fail ho gaya, machine offline: 1 AM batch ko pata nahi ki data poora hai ya nahi.
4. **Urgent issues delay:** coin jam ka pata agle midnight pe; machine din bhar kharab, sales loss.
5. **Batch dependency:** 1 AM job tab hi sahi jab saare reports aa chuke hon; ek bhi retry late ho to schedule galat.
6. **Single server / DB** = bottleneck aur SPOF. Cellular data cost bhi (chhota payload chahiye).

**Fixes**
1. **Jitter:** har machine ka report time = midnight + `hash(machine_id) % window` (jaise 2 ghante), ya random delay. Load flat.
2. **Ingestion queue** (Kafka/SQS): API sirf queue me daale, consumers DB me likhein. Spikes absorb hote hain.
3. **Retry with exponential backoff + local buffer** machine pe; idempotent updates (machine_id + report_id).
4. **Urgent events turant bhejo** (event-driven alert), sirf routine stock midnight/batch pe.
5. **Heartbeat / missing report detection:** jis machine ne report nahi bheji, usko alert/flag; batch usse alag treat kare.
6. **Region-wise batches** (timezone / city ke hisaab se) aur streaming pipeline (Flink/Spark) rolling schedule ke liye.
7. Lightweight protocol (MQTT) + compact payload; DB sharding by machine_id / region.

## Follow-ups / traps
- Math dikhao: 188,888 / 3600 ~ 52 req/s (spread) vs burst (hazaaron req/s).
- Machine ki clock galat ho sakti hai: server timestamps use karo.
