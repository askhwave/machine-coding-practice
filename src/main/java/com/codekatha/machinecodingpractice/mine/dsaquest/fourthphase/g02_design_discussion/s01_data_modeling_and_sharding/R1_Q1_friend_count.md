# R1-Q1: Friend count on every post (Facebook clone, must scale)

**Source:** Round 1, system-design discussion. **Pehle khud 2-3 min bolo/likho, phir neeche dekho.**

## Question
Tables: `USER(user_id PK, name, created_date)` aur `USER_RELATIONSHIP(friendship_id PK, user_id idx, user2_id idx, start_date)`.
Har post pe author ke friends ka count dikhana hai (view ke time pe). Database side pe kaise implement karoge? "Facebook se bhi popular" ho jayenge, to scale chahiye.

## Pehle clarify karo
- Count kitna fresh chahiye? (exact vs thoda stale chalega)
- Read:write ratio? (post views >>> friendships)
- Ek friendship = 1 row ya 2 rows (dono directions)?

## Model answer (spoiler)
1. **Naive:** `SELECT COUNT(*) ... WHERE user_id=? OR user2_id=?` har post view pe. Index hai, phir bhi popular user (lakhs friends) pe slow, aur reads bahut zyada. Scale nahi karega.
2. **Denormalize:** `USER.friend_count` (ya alag `user_stats` table). Friendship add/remove ke transaction me dono users ka counter +1 / -1. Read = primary key lookup, O(1).
3. **Hot rows:** viral user ka counter row contention. Fix: sharded counters (N sub-counters, read = sum), ya events queue (Kafka) -> async batch update. Is case me eventual consistency chalegi.
4. **Cache:** Redis me `friend_count:{user_id}`; friendship events pe update/invalidate. DB sirf source of truth.
5. **Relationship table ko shard karo** `user_id` se, aur har friendship ke 2 rows (A->B, B->A) rakho. Tab "user ke friends" query ek shard me, ek index se hoti hai (OR wali query nahi).
6. **Reconciliation job:** raat ko counter vs actual COUNT compare karke drift theek karo (bugs / lost events).
7. **Idempotency:** same friend event do baar aaye to count do baar na badhe (friendship_id se dedupe).

## Follow-ups / traps
- Unfriend / account delete pe count ghatana mat bhoolo.
- Exact count zaroori nahi: "5K+" jaisa approximate dikhana bhi chal sakta hai.
- Count aur relationship insert ek hi transaction me ya outbox pattern se (dual-write problem).
