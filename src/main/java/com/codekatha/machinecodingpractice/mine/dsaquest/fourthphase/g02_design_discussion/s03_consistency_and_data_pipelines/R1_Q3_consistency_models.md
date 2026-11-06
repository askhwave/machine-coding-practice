# R1-Q3: Strong vs eventual consistency - 3 applications

**Source:** Round 1, conceptual discussion. **Pehle har ek ka choice + 1 line reason bolo.**

## Question
Har application ke liye strong ya eventual consistency? Kyun?
1. API jo 20 ms me respond kare, video stream ka metadata (author name, rating, views) laata hai.
2. Web analytics platform jo popular page ka har click record karta hai.
3. Banking system: checking accounts me deposits aur payments.

## Model answer (spoiler)
| App | Choice | Reason |
|---|---|---|
| Video metadata API (20 ms) | **Eventual** | Read-heavy, latency critical. Replicas / cache / CDN se serve, rating ya views thode stale ho to koi nuksan nahi. Strong consistency ka cross-node coordination 20 ms budget kha jata hai. |
| Click analytics | **Eventual** | Write-heavy firehose. Availability + throughput important; thoda late ya approximate aggregate chalta hai. Clicks queue (Kafka) me, baad me aggregate. Individual click lose na ho (at-least-once + dedupe). |
| Banking | **Strong** | Balance galat nahi ho sakta: double-spend, negative balance, lost update. ACID transactions, serializable / row-level locking, synchronous replication. Availability thodi kam ho to bhi chalega (CP). |

## Follow-ups / traps
- CAP: partition pe ya consistency ya availability. PACELC: normal time me latency vs consistency.
- Ek hi system me mix ho sakta hai: bank me balance strong, par statement history / notifications eventual.
- Metadata me "views" eventual, par "author name" almost static: cache aggressively.
- "Read-your-writes" jaisi middle consistency bhi bolo (user ne rating di to use turant dikhe).
