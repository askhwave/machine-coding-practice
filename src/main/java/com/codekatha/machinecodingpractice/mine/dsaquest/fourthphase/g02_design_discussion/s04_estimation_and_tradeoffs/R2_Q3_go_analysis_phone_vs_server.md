# R2-Q3: Go game analysis - phone pe ya server farm pe?

**Source:** Round 2, trade-off discussion. **Pehle dono ke pros/cons likho.**

## Question
Go board game mobile app. Complete game ka analysis (har position pe suggested moves). Library desktop pe average ~1 minute leti hai ek game ke liye; average game ~200 moves. Do options: (1) phone pe hi analysis, (2) server farm pe bhejo, result user ko wapas. Dono ke advantages / disadvantages?

## Model answer (spoiler)
| | Phone pe | Server farm pe |
|---|---|---|
| **Pros** | Offline chalta hai; server cost zero; user ka data device pe (privacy); users badhne pe compute apne aap scale | Fast, consistent (powerful CPU/GPU); phone battery / heat ka tension nahi; library aur model centrally update; IP protected; common positions ka result cache kar sakte hain |
| **Cons** | Phone desktop se kafi slow (1 min -> kai minute); battery drain, heating, background limits; app size badhta hai; library ko mobile ke liye port (ARM), alag devices pe alag performance; update ke liye app release | Compute cost (har game ~1 CPU-minute: 1M games/day ~ 16.7K CPU-hours/day); peak load ke liye autoscaling; network chahiye, latency + queue wait; privacy / storage; server down = feature down |

**Recommendation:** hybrid. Quick shallow analysis phone pe (instant, offline), deep analysis server pe async job (push notification jab ready ho). Results cache karo (same game / positions).

## Follow-ups / traps
- Numbers do: 200 moves / 60 s ~ 0.3 s per position. Server pe parallelism (positions independent) se ek game kuch seconds me.
- Queue + workers, retries, rate limit per user.
- Cost vs UX trade-off ko explicitly bolo.
