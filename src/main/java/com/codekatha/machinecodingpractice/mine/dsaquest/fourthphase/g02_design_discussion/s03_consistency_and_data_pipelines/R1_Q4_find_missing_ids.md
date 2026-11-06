# R1-Q4: Failed requests ke missing IDs dhoondna (DB IDs vs 500 servers ke logs)

**Source:** Round 1, system-design / data discussion. **Pehle khud approach sochke likho.**

## Question
Bug ki wajah se bahut saari requests fail ho gayin. Database me saari IDs stored hain. 500 production servers ke bade log files me successful requests ki IDs log hain. Missing (failed) IDs kaise nikaloge?

## Pehle clarify karo
- IDs kitni hain (millions? billions?), integer dense range ya random strings / UUID?
- Logs me duplicates (retries) ho sakte hain? Logs kitne bade (GBs / TBs)?
- Exact answer chahiye ya approximate chalega? Time limit?

## Model answer (spoiler)
Goal: `failed = allIds - successIds`.
1. **Small data:** success IDs ka HashSet, DB IDs stream karke jo set me nahi wo failed. (Memory me fit hone pe hi.)
2. **Dense integer IDs -> bitmap:** 1B IDs = 125 MB bitset. Logs stream karo, bit set karo; end me jahan bit 0 wahi missing. Har server apna bitmap bana ke bheje, sab ko OR karo.
3. **Bahut bada / non-integer IDs -> partition by hash:** `bucket = hash(id) % P`. Dono datasets (DB aur logs) ko bucket me baanto; har bucket chhota ho ke memory me fit hota hai; bucket-wise set difference. Parallel (MapReduce / Spark anti-join).
4. **External sort + merge:** dono sorted streams ko merge karke diff (two-pointer). Disk-friendly.
5. **Database route:** success IDs ko staging table me load karo, `LEFT JOIN ... WHERE s.id IS NULL`.
6. **Bloom filter (approximate):** success IDs ka bloom filter; DB IDs filter se check karo. False positive ka matlab kuch failed IDs miss ho sakti hain, isliye sirf pre-filter, ya jab approximate chalta ho.
7. **Logs pehle process karo har server pe:** local dedupe + local sorted/bitmap, phir network pe kam data.

## Follow-ups / traps
- Duplicates me set / bitmap natural dedupe karte hain.
- Time window filter lagao (sirf bug ke time ki IDs) to data bahut kam.
- 500 servers => parallelism: har server local summary, central merge.
