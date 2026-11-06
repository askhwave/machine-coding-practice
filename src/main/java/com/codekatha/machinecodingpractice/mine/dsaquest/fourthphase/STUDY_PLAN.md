# DSA Quest - Phase 4: Atlassian Candidate-Reported Questions + Preparation Plan

**Phases:** firstphase = tumhare 128 | secondphase = 169 (extras ke saath) | thirdphase = Atlassian cheatsheet (50) | **fourthphase = Atlassian round-wise reported questions (3 coding + 9 design/conceptual discussion)**.

Source: tumhara shared Atlassian question list (Round 1 + Round 2). Notes garbled the thi, isliye statements reconstruct kiye hain; assumptions har class ke Constraints me likhe hain (interview me bhi yehi clarify karte hain).

Structure: `fourthphase/gNN_<group>/sNN_<subgroup>/<file>`
- `g01_coding` = Java classes (stub + tests, `main()` chalao).
- `g02_design_discussion` = `.md` notes (pehle khud bolo/likho, phir spoiler section dekho).

## Index

### g01_coding

#### s01_board_game_simulation: Board Game Simulation & BFS
| Done | Round | Question | File |
|---|---|---|---|
| [ ] | R1 coding | Teleporter board: possible squares in one turn, follow-up BFS can-finish (+ bonus min turns) | `Round1_TeleporterBoard` |

#### s02_hashing_pairs: Hashing, Pair With Target Sum
| Done | Round | Question | File |
|---|---|---|---|
| [ ] | R2 coding 1 | Two distinct songs adding up to exactly 7 minutes | `Round2_TwoSongsSevenMinutes` |

#### s03_graph_chain_search: Graph Search, Longest Chain
| Done | Round | Question | File |
|---|---|---|---|
| [ ] | R2 coding 2 | Longest song chain (last word = next first word, no repeats) | `Round2_LongestSongChain` |

### g02_design_discussion

#### s01_data_modeling_and_sharding
| Done | Round | Question | File |
|---|---|---|---|
| [ ] | R1 Q1 | Friend count on every post at Facebook scale | `R1_Q1_friend_count.md` |
| [ ] | R2 Q5 | Photo sharding by username's first letter: problems? | `R2_Q5_alphabetical_sharding.md` |

#### s02_load_balancing_and_scaling
| Done | Round | Question | File |
|---|---|---|---|
| [ ] | R1 Q2 | Google Docs clone: round-robin permanent doc-to-server assignment | `R1_Q2_google_docs_round_robin.md` |
| [ ] | R2 Q1 | Subtitle service crashes above 10 concurrent videos: workarounds | `R2_Q1_subtitle_service_crash.md` |
| [ ] | R2 Q2 | 188,888 vending machines reporting at midnight: problems and fixes | `R2_Q2_vending_machines_midnight.md` |

#### s03_consistency_and_data_pipelines
| Done | Round | Question | File |
|---|---|---|---|
| [ ] | R1 Q3 | Strong vs eventual consistency: metadata API, click analytics, banking | `R1_Q3_consistency_models.md` |
| [ ] | R1 Q4 | Find missing (failed) IDs from DB vs logs of 500 servers | `R1_Q4_find_missing_ids.md` |

#### s04_estimation_and_tradeoffs
| Done | Round | Question | File |
|---|---|---|---|
| [ ] | R2 Q3 | Go game analysis: on phone vs server farm | `R2_Q3_go_analysis_phone_vs_server.md` |
| [ ] | R2 Q4 | Photo storage and cost estimate for next year | `R2_Q4_photo_storage_estimate.md` |

## Preparation plan (14 days, ~2-2.5 hours/day, date ke hisaab se adjust karo)

Assumption: firstphase (apne 128) pehle complete ho chuka hai ya saath me chal raha hai. Ye plan Atlassian-specific hai: thirdphase ke **22 naye** problems + fourthphase ke 12 items, phir thirdphase ke **28 revision** problems. Jo problem phas jaye use "redo list" me daalo.

| Day | Coding (new) | Design / discussion | Folder |
|---|---|---|---|
| 1 | #36 Valid Sudoku, #438 Find All Anagrams, **Two Songs 7 min** | R1 Q3 Consistency | thirdphase g01/g02, fourthphase g01 s02, g02 s03 |
| 2 | #32 Longest Valid Parentheses, #706 Design HashMap, #23 Merge k Lists | R1 Q1 Friend count | thirdphase g03, g08 |
| 3 | #101 Symmetric Tree, #127 Word Ladder, **Teleporter Board (BFS)** | R1 Q2 Google Docs | thirdphase g05 s01, fourthphase g01 s01 |
| 4 | #1334 Find the City, #269 Alien Dictionary (Premium), **Longest Song Chain** | R2 Q5 Sharding | thirdphase g05, fourthphase g01 s03 |
| 5 | #78 Subsets, #39 Combination Sum, #46 Permutations | R1 Q4 Missing IDs | thirdphase g06 s01 |
| 6 | #79 Word Search, #51 N-Queens, #212 Word Search II | R2 Q1 Subtitle crash | thirdphase g06 s02 |
| 7 | #4 Median of Two Sorted Arrays, #50 Pow(x, n), #757 Set Intersection Size | R2 Q2 Vending machines | thirdphase g07, g08 s02 |
| 8 | #91 Decode Ways, #72 Edit Distance, **Rate Limiter**, **Leader Election** | R2 Q3 Go analysis | thirdphase g09, g03 s03 |
| 9 | Revision (timed 20 min each): #1, #169, #49, #54, #73, #11, #15, #42, #3, #28, #121, #239 | R2 Q4 Photo storage estimate | thirdphase g01, g02 |
| 10 | Revision: #20, #150, #155, #146, #2, #21, #206, #141, #234, #207 | Re-do 3 design notes bina dekhe, 2 min bolke | thirdphase g03, g04, g05 |
| 11 | Revision: #33, #215, #347, #56, #53, #70 + redo list | Re-do remaining design notes | thirdphase g07, g08, g09 |
| 12 | **Mock 1 (Round-1 style):** 1 design question (10 min) + 1 coding (35 min), random pick | feedback: kya miss hua | fourthphase |
| 13 | **Mock 2 (Round-2 style):** 2 design questions (15 min) + 1 coding (35 min), random pick | feedback | fourthphase |
| 14 | Weak spots ka redo list + halka revision | Light day | all |

### Har coding question ke liye time-box (35-40 min)
1. 3-5 min: clarify (input size, duplicates, edge cases, assumptions bol ke likho).
2. 3-5 min: brute force bolo, complexity bolo, phir optimal approach.
3. 15-20 min: code (clean variable names, boundary checks).
4. 5-8 min: dry run + edge tests (empty, single, duplicates, max size).
5. Last: time/space complexity aur follow-up (Atlassian me follow-up aksar hota hai, jaise Teleporter me BFS).

### Har design / discussion question ke liye (8-10 min bolna)
1. 1-2 min: requirements clarify (scale, freshness, failure tolerance).
2. Pehle simple approach, uska bottleneck bolo (numbers ke saath: req/s, size).
3. Fix + trade-off (kya milta hai, kya jata hai).
4. Failure cases aur monitoring ek line me.
5. Pehle khud bolo, phir note ka spoiler section match karo; jo miss hua use redo list me.

### Ek rule
Naye problems me pehle khud try, tab hi hint/spoiler. Phas jao to bolna, pseudocode mil jayega.
