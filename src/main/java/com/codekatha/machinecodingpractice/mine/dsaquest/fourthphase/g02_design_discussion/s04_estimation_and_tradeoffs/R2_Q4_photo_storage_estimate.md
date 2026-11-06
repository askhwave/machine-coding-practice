# R2-Q4: Photo storage estimate (agle 1 saal) aur cost

**Source:** Round 2, estimation discussion. **Pehle batao kya-kya poochhoge.**

## Question
Simple photo storage + sharing service. Users photos upload karte hain, links share hote hain. Cloud nahi, apne server farms. Agle saal ke liye storage aur uski cost ka estimate banana hai. Kaunsi information chahiye aur kin factors ko dekhoge?

## Model answer (spoiler)
**Poochhne wali cheezein**
1. Users: abhi kitne, growth rate (DAU / MAU), peak.
2. Upload rate: per user per day kitni photos.
3. Average photo size (original resolution / format), thumbnails + alag sizes bhi.
4. Retention: kab tak rakhna, delete policy, free vs paid users.
5. Read:write ratio (views vs uploads) - bandwidth / CDN ke liye.
6. Videos / metadata bhi hain ya sirf photos?

**Estimate formula**
`storage/year = users x photos/user/day x 365 x avg_size x (1 + thumbnail overhead) x replication factor x headroom`
- Replication: 3 copies (ya erasure coding ~1.4-1.5x). Backup alag.
- Headroom: disks 70-80% se zyada na bharein (growth + rebuild space).
- Example: 1M users x 2 photos/day x 3 MB = ~2.2 PB/saal raw, x3 replication = ~6.6 PB.

**Cost factors**
- Disk $/TB, servers, racks, power, cooling, network, data center jagah, staff.
- Disk failure rate + replacement, 3-5 saal me hardware refresh.
- Bandwidth / CDN cost, metadata DB, backups, monitoring.
- Optimizations: compression (WebP/AVIF), dedup, hot/cold tiering (purani photos sasti storage pe).

## Follow-ups / traps
- Ek hi number mat do: range do (low / expected / high growth).
- Peak vs average bhi: capacity planning peak pe hoti hai.
- Cloud vs on-prem break-even ka ek line comparison.
