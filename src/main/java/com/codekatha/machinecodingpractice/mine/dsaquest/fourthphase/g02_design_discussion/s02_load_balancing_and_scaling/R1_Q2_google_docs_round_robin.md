# R1-Q2: Google Docs clone - documents ko round-robin se servers pe permanently assign karna

**Source:** Round 1, system-design discussion. **Pehle khud concerns likho.**

## Question
Ek document ek hi server handle karta hai (chahe kitne bhi users ho). Servers ki fixed sankhya hai. Load balancer round-robin se documents ko permanently servers pe assign karta hai, taaki har server pe barabar documents hon. Is load balancing me koi concern? Scalability ke liye kaise fix karoge?

## Model answer (spoiler)
**Concerns**
1. **Barabar documents != barabar load.** Koi doc me 1 user, koi me 500 active editors; koi 10 MB, koi 1 KB. Kuch servers hot, kuch idle.
2. **Permanent assignment:** hot doc ko move nahi kar sakte; server overload ho to koi relief nahi.
3. **Server failure:** us server ke saare docs unavailable (single point of failure), koi failover nahi.
4. **Fixed servers:** traffic badhne pe naya server add kare to purane docs rebalance nahi hote.
5. **Idle / purane documents** server memory hold karte rahte hain, naye active docs ke liye jagah nahi.

**Fixes**
1. **Load-aware placement:** naye document ko least-loaded server pe (CPU, connections, active editors) assign karo, round-robin ki jagah.
2. **Directory service** (etcd/ZooKeeper/DB): `doc_id -> server`. Doc ko migrate kar sakte ho (state flush, mapping update, clients reconnect).
3. **Consistent hashing + virtual nodes** agar mapping compute karni ho.
4. **Replication / failover:** doc state + operation log durable storage me (DB / log). Server down => doosra server log se doc load kare, ya hot standby.
5. **Idle docs evict:** inactive doc ko memory se hata ke storage me; wapas users aaye to load.
6. **Auto-scaling** + monitoring; hot doc ke liye bada server (vertical scaling), kyunki ek doc ek server pe hi rehna hai.

## Follow-ups / traps
- Single-server-per-doc ki wajah se ek doc ke editors ki limit hoti hai: batao ki OT/CRDT se conflicts handle hote hain.
- Migration ke time editing pause ya buffering kaise handle karoge?
