# R2-Q5: Photos ko username ke first letter se shard karna

**Source:** Round 2, system-design discussion. **Pehle khud problems nikalo.**

## Question
Photo sharing service. Photos aur data ko multiple machines pe evenly baantna hai. Decision: username ke alphabet se shard (26 servers => 'a' server 1, 'b' server 2, ...), scheme kisi bhi number of servers ke liye chalegi. Is design me koi problem?

## Model answer (spoiler)
**Problems**
1. **Skew:** 's', 'm', 'a' se shuru hone wale usernames 'x', 'q', 'z' se bahut zyada. Kuch servers overload, kuch khaali. "Evenly" nahi hota.
2. **Hot shards:** popular user ya trending photos ek server pe pile ho jate hain.
3. **Growth / naye servers:** server count badalne pe mapping badalti hai => bahut data move. 26 se zyada servers ho to letter ke andar split kaise kare?
4. **Non-letter usernames:** digits, symbols, unicode, uppercase - kis server pe?
5. **Username change:** user ne username badla to data dusre shard pe move karna padega.
6. **Single point of failure:** ek shard down = us letter ke saare users down (replication nahi bataya).

**Fixes**
1. **Hash sharding** `hash(user_id) % N` (immutable id pe, username pe nahi): uniform distribution.
2. **Consistent hashing + virtual nodes:** server add/remove pe sirf ~1/N data move.
3. **Directory / lookup service:** `user -> shard` mapping table (cached). Hot user ko alag shard pe rakh sakte ho.
4. **Range sharding with auto split/merge** (HBase/Spanner style) agar range queries chahiye.
5. **Hot photos:** CDN + cache. Replication (primary + replicas) har shard ke liye.
6. Shard size / QPS monitor karke rebalance.

## Follow-ups / traps
- Hash sharding me range query ("a se c tak users") mushkil hoti hai: trade-off bolo.
- `% N` plain mod me N badalne pe sab reshuffle: isliye consistent hashing.
