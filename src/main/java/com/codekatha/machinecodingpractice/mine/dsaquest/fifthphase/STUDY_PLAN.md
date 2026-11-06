# DSA Quest - Phase 5: Atlassian Candidate-Reported Problems (CSV)

Source: `krishnadey30/LeetCode-Questions-CompanyWise` -> `atlassian_alltime.csv` (53 rows) + recency files (6 months / 1 year / 2 years).
Is CSV ke **24 problems pehle se phases 1-3 me the** (neeche revision table), baaki **29 naye** yahan hain (13 pichhle 6 months me report hue).

- **Frequency score** = CSV ka number (relative; bada = zyada baar report hua). **Last seen** = kis recency file me aaya.
- Ye candidate-reported data hai: official nahi, aur exact question badal sakta hai. Patterns pe dhyan do, sirf list ratta mat maaro.
- Structure: `fifthphase/gNN_<group>/sNN_<subgroup>/LCxxxx_<Name>.java` (statement + examples + constraints + hint + TODO stub + `main()` tests).

## Priority order (interview jaldi aa raha ho to isi order me)

| # | LeetCode | Problem | Difficulty | Last seen | Freq | Class path |
|---|---|---|---|---|---|---|
| 1 | #366 | Find Leaves of Binary Tree (Premium) | Medium | 6 months | 0.529 | `g01_trees/s01_tree_dfs/LC0366_FindLeavesOfBinaryTree` |
| 2 | #981 | Time Based Key-Value Store | Medium | 6 months | 0.402 | `g02_design/s01_time_based_design/LC0981_TimeBasedKeyValueStore` |
| 3 | #17 | Letter Combinations of a Phone Number | Medium | 6 months | 0.222 | `g06_backtracking_and_dp/s01_backtracking/LC0017_LetterCombinationsOfAPhoneNumber` |
| 4 | #362 | Design Hit Counter (Premium) | Medium | 6 months | 0.208 | `g02_design/s01_time_based_design/LC0362_DesignHitCounter` |
| 5 | #284 | Peeking Iterator | Medium | 6 months | 0.119 | `g02_design/s02_iterator_design/LC0284_PeekingIterator` |
| 6 | #1223 | Dice Roll Simulation | Medium | 6 months | 0.102 | `g06_backtracking_and_dp/s02_dp/LC1223_DiceRollSimulation` |
| 7 | #359 | Logger Rate Limiter (Premium) | Easy | 6 months | 0.082 | `g02_design/s01_time_based_design/LC0359_LoggerRateLimiter` |
| 8 | #1366 | Rank Teams by Votes | Medium | 6 months | 0.072 | `g03_heap_and_ranking/s02_sorting_intervals_ranking/LC1366_RankTeamsByVotes` |
| 9 | #540 | Single Element in a Sorted Array | Medium | 6 months | 0.043 | `g04_arrays_strings/s02_binary_search/LC0540_SingleElementInASortedArray` |
| 10 | #31 | Next Permutation | Medium | 6 months | 0.037 | `g04_arrays_strings/s03_permutation_and_window/LC0031_NextPermutation` |
| 11 | #173 | Binary Search Tree Iterator | Medium | 6 months | 0.019 | `g01_trees/s02_bst/LC0173_BinarySearchTreeIterator` |
| 12 | #872 | Leaf-Similar Trees | Easy | 6 months | 0.018 | `g01_trees/s01_tree_dfs/LC0872_LeafSimilarTrees` |
| 13 | #22 | Generate Parentheses | Medium | 6 months | 0.004 | `g06_backtracking_and_dp/s01_backtracking/LC0022_GenerateParentheses` |
| 14 | #860 | Lemonade Change | Easy | 1 year | 0.397 | `g04_arrays_strings/s01_greedy_and_scans/LC0860_LemonadeChange` |
| 15 | #1120 | Maximum Average Subtree (Premium) | Medium | 1 year | 0.269 | `g01_trees/s01_tree_dfs/LC1120_MaximumAverageSubtree` |
| 16 | #394 | Decode String | Medium | 1 year | 0.032 | `g05_stack_parsing/s01_stack_parsing/LC0394_DecodeString` |
| 17 | #123 | Best Time to Buy and Sell Stock III | Hard | 1 year | 0.025 | `g06_backtracking_and_dp/s02_dp/LC0123_BestTimeToBuyAndSellStockIII` |
| 18 | #647 | Palindromic Substrings | Medium | 1 year | 0.023 | `g06_backtracking_and_dp/s02_dp/LC0647_PalindromicSubstrings` |
| 19 | #701 | Insert into a Binary Search Tree | Medium | 1 year | 0.016 | `g01_trees/s02_bst/LC0701_InsertIntoABinarySearchTree` |
| 20 | #528 | Random Pick with Weight | Medium | 1 year | 0.015 | `g04_arrays_strings/s02_binary_search/LC0528_RandomPickWithWeight` |
| 21 | #821 | Shortest Distance to a Character | Easy | 2 years | 0.243 | `g04_arrays_strings/s01_greedy_and_scans/LC0821_ShortestDistanceToACharacter` |
| 22 | #253 | Meeting Rooms II (Premium) | Medium | 2 years | 0.122 | `g03_heap_and_ranking/s02_sorting_intervals_ranking/LC0253_MeetingRoomsII` |
| 23 | #844 | Backspace String Compare | Easy | 2 years | 0.041 | `g04_arrays_strings/s01_greedy_and_scans/LC0844_BackspaceStringCompare` |
| 24 | #713 | Subarray Product Less Than K | Medium | 2 years | 0.025 | `g04_arrays_strings/s03_permutation_and_window/LC0713_SubarrayProductLessThanK` |
| 25 | #341 | Flatten Nested List Iterator | Medium | 2 years | 0.020 | `g02_design/s02_iterator_design/LC0341_FlattenNestedListIterator` |
| 26 | #227 | Basic Calculator II | Medium | 2 years | 0.012 | `g05_stack_parsing/s01_stack_parsing/LC0227_BasicCalculatorII` |
| 27 | #295 | Find Median from Data Stream | Hard | 2 years | 0.009 | `g03_heap_and_ranking/s01_heap_top_k/LC0295_FindMedianFromDataStream` |
| 28 | #692 | Top K Frequent Words | Medium | 2 years | 0.008 | `g03_heap_and_ranking/s01_heap_top_k/LC0692_TopKFrequentWords` |
| 29 | #1307 | Verbal Arithmetic Puzzle | Hard | older | 0.000 | `g06_backtracking_and_dp/s01_backtracking/LC1307_VerbalArithmeticPuzzle` |

## 5-day sprint (6 problems/day, Day 5 = baaki + revision)

- **Day 1**: #366 Find Leaves of Binary Tree, #981 Time Based Key-Value Store, #17 Letter Combinations of a Phone Number, #362 Design Hit Counter, #284 Peeking Iterator, #1223 Dice Roll Simulation
- **Day 2**: #359 Logger Rate Limiter, #1366 Rank Teams by Votes, #540 Single Element in a Sorted Array, #31 Next Permutation, #173 Binary Search Tree Iterator, #872 Leaf-Similar Trees
- **Day 3**: #22 Generate Parentheses, #860 Lemonade Change, #1120 Maximum Average Subtree, #394 Decode String, #123 Best Time to Buy and Sell Stock III, #647 Palindromic Substrings
- **Day 4**: #701 Insert into a Binary Search Tree, #528 Random Pick with Weight, #821 Shortest Distance to a Character, #253 Meeting Rooms II, #844 Backspace String Compare, #713 Subarray Product Less Than K
- **Day 5**: baaki #341, #227, #295, #692, #1307 + neeche wale revision table me se 6-month wale (pehle se kiye hue) bina dekhe dobara solve.

## Groups

### Trees  (`g01_trees`)

_Bottom-up DFS (child ka result parent ko do) aur BST rule (left < node < right)._

**Tree DFS (bottom-up)** (`s01_tree_dfs`) - _Postorder: pehle left/right se info lo, phir node pe decide karo. Leaf order, height, sum+count - sab isi shape ke._

| Done | # | Problem | Difficulty | Last seen | Class |
|---|---|---|---|---|---|
| [ ] | 872 | Leaf-Similar Trees | Easy | 6 months | `LC0872_LeafSimilarTrees` |
| [ ] | 1120 | Maximum Average Subtree (Premium) | Medium | 1 year | `LC1120_MaximumAverageSubtree` |
| [ ] | 366 | Find Leaves of Binary Tree (Premium) | Medium | 6 months | `LC0366_FindLeavesOfBinaryTree` |

**BST Insert & Iterator** (`s02_bst`) - _BST me value ka raasta compare se milta hai. Iterator = controlled inorder (explicit stack, O(h) memory)._

| Done | # | Problem | Difficulty | Last seen | Class |
|---|---|---|---|---|---|
| [ ] | 701 | Insert into a Binary Search Tree | Medium | 1 year | `LC0701_InsertIntoABinarySearchTree` |
| [ ] | 173 | Binary Search Tree Iterator | Medium | 6 months | `LC0173_BinarySearchTreeIterator` |

### Design (time-based & iterator)  (`g02_design`)

_Atlassian ka favourite: chhoti class design - hash map + time window, aur wrapper iterators._

**Time-based Design** (`s01_time_based_design`) - _Timestamp aate hain chronological order me: map (last seen), queue/circular buffer (window), per-key sorted list + binary search._

| Done | # | Problem | Difficulty | Last seen | Class |
|---|---|---|---|---|---|
| [ ] | 359 | Logger Rate Limiter (Premium) | Easy | 6 months | `LC0359_LoggerRateLimiter` |
| [ ] | 362 | Design Hit Counter (Premium) | Medium | 6 months | `LC0362_DesignHitCounter` |
| [ ] | 981 | Time Based Key-Value Store | Medium | 6 months | `LC0981_TimeBasedKeyValueStore` |

**Iterator Design** (`s02_iterator_design`) - _Lazy iteration: next/hasNext ke beech state rakho (look-ahead slot ya stack). Constructor me poora kaam mat karo._

| Done | # | Problem | Difficulty | Last seen | Class |
|---|---|---|---|---|---|
| [ ] | 284 | Peeking Iterator | Medium | 6 months | `LC0284_PeekingIterator` |
| [ ] | 341 | Flatten Nested List Iterator | Medium | 2 years | `LC0341_FlattenNestedListIterator` |

### Heap, Sorting & Ranking  (`g03_heap_and_ranking`)

_Top-K / streaming ke liye heap, aur custom comparator wale ranking problems._

**Heap - Top K & Streaming Median** (`s01_heap_top_k`) - _Size-k heap (comparator ka dhyan), do heaps (max-heap low half + min-heap high half) se running median._

| Done | # | Problem | Difficulty | Last seen | Class |
|---|---|---|---|---|---|
| [ ] | 692 | Top K Frequent Words | Medium | 2 years | `LC0692_TopKFrequentWords` |
| [ ] | 295 | Find Median from Data Stream | Hard | 2 years | `LC0295_FindMedianFromDataStream` |

**Sorting, Intervals & Ranking** (`s02_sorting_intervals_ranking`) - _Sort + sweep (starts/ends alag sort), ya multi-key comparator (votes matrix)._

| Done | # | Problem | Difficulty | Last seen | Class |
|---|---|---|---|---|---|
| [ ] | 253 | Meeting Rooms II (Premium) | Medium | 2 years | `LC0253_MeetingRoomsII` |
| [ ] | 1366 | Rank Teams by Votes | Medium | 6 months | `LC1366_RankTeamsByVotes` |

### Arrays & Strings  (`g04_arrays_strings`)

_Linear scans, binary search aur in-place array tricks - chhote but trap-wale problems._

**Greedy & Two-pass Scans** (`s01_greedy_and_scans`) - _Counters se greedy (lemonade), left-to-right + right-to-left do pass (distance), peeche se compare (backspace)._

| Done | # | Problem | Difficulty | Last seen | Class |
|---|---|---|---|---|---|
| [ ] | 860 | Lemonade Change | Easy | 1 year | `LC0860_LemonadeChange` |
| [ ] | 821 | Shortest Distance to a Character | Easy | 2 years | `LC0821_ShortestDistanceToACharacter` |
| [ ] | 844 | Backspace String Compare | Easy | 2 years | `LC0844_BackspaceStringCompare` |

**Binary Search Variants** (`s02_binary_search`) - _Parity trick (single element), prefix sums + lower-bound (weighted random)._

| Done | # | Problem | Difficulty | Last seen | Class |
|---|---|---|---|---|---|
| [ ] | 540 | Single Element in a Sorted Array | Medium | 6 months | `LC0540_SingleElementInASortedArray` |
| [ ] | 528 | Random Pick with Weight | Medium | 1 year | `LC0528_RandomPickWithWeight` |

**Permutation & Window** (`s03_permutation_and_window`) - _Next permutation = pivot, swap, reverse suffix. Product window = shrinking left pointer._

| Done | # | Problem | Difficulty | Last seen | Class |
|---|---|---|---|---|---|
| [ ] | 31 | Next Permutation | Medium | 6 months | `LC0031_NextPermutation` |
| [ ] | 713 | Subarray Product Less Than K | Medium | 2 years | `LC0713_SubarrayProductLessThanK` |

### Stack & Parsing  (`g05_stack_parsing`)

_Nested ya precedence wale strings: stack (ya recursion) context save karta hai._

**Decode & Calculate** (`s01_stack_parsing`) - _Decode String = (count, prefix) stack; Calculator II = last-term stack ya running value, * / ko turant resolve karo._

| Done | # | Problem | Difficulty | Last seen | Class |
|---|---|---|---|---|---|
| [ ] | 394 | Decode String | Medium | 1 year | `LC0394_DecodeString` |
| [ ] | 227 | Basic Calculator II | Medium | 2 years | `LC0227_BasicCalculatorII` |

### Backtracking & DP  (`g06_backtracking_and_dp`)

_Choose / explore / un-choose, aur state-based DP (position + last choice + run length)._

**Backtracking** (`s01_backtracking`) - _Digit mapping product, valid-prefix pruning (open/close counts), aur column-wise constraint search (cryptarithm)._

| Done | # | Problem | Difficulty | Last seen | Class |
|---|---|---|---|---|---|
| [ ] | 17 | Letter Combinations of a Phone Number | Medium | 6 months | `LC0017_LetterCombinationsOfAPhoneNumber` |
| [ ] | 22 | Generate Parentheses | Medium | 6 months | `LC0022_GenerateParentheses` |
| [ ] | 1307 | Verbal Arithmetic Puzzle | Hard | older | `LC1307_VerbalArithmeticPuzzle` |

**Dynamic Programming** (`s02_dp`) - _Expand-around-centre, 3D state DP (len, last, run), aur state-machine DP (<=2 transactions)._

| Done | # | Problem | Difficulty | Last seen | Class |
|---|---|---|---|---|---|
| [ ] | 647 | Palindromic Substrings | Medium | 1 year | `LC0647_PalindromicSubstrings` |
| [ ] | 1223 | Dice Roll Simulation | Medium | 6 months | `LC1223_DiceRollSimulation` |
| [ ] | 123 | Best Time to Buy and Sell Stock III | Hard | 1 year | `LC0123_BestTimeToBuyAndSellStockIII` |

## Already covered in earlier phases (revision only)

Ye CSV me bhi hain, naye files nahi banaye - wahi purani class bina dekhe dobara solve karo. 6-month wale pehle.

| Done | # | Problem | Last seen | Freq | Where |
|---|---|---|---|---|---|
| [ ] | 1071 | Greatest Common Divisor of Strings | 6 months | 0.256 | `secondphase/p06_strings` |
| [ ] | 300 | Longest Increasing Subsequence | 6 months | 0.102 | `secondphase/p12_dynamic_programming` |
| [ ] | 706 | Design HashMap | 6 months | 0.068 | `thirdphase/g03_stack_and_design/s02_data_structure_design` |
| [ ] | 98 | Validate Binary Search Tree | 6 months | 0.058 | `secondphase/p09_trees` |
| [ ] | 150 | Evaluate Reverse Polish Notation | 6 months | 0.032 | `firstphase/set34_stack_queue; secondphase/p07_stack_queue; thirdphase/g03_stack_and_design/s01_stack_applications` |
| [ ] | 46 | Permutations | 6 months | 0.017 | `thirdphase/g06_backtracking/s01_subsets_combinations_permutations` |
| [ ] | 3 | Longest Substring Without Repeating Characters | 6 months | 0.010 | `firstphase/set12_sliding_window; secondphase/p03_sliding_window; thirdphase/g02_two_pointers_sliding_window/s02_string_window_and_matching` |
| [ ] | 102 | Binary Tree Level Order Traversal | 6 months | 0.008 | `secondphase/p09_trees` |
| [ ] | 236 | Lowest Common Ancestor of a Binary Tree | 6 months | 0.005 | `secondphase/p09_trees` |
| [ ] | 23 | Merge k Sorted Lists | 1 year | 0.097 | `thirdphase/g08_heap_and_intervals/s01_heap_top_k_and_merge` |
| [ ] | 20 | Valid Parentheses | 1 year | 0.093 | `firstphase/set33_stack_queue; secondphase/p07_stack_queue; thirdphase/g03_stack_and_design/s01_stack_applications` |
| [ ] | 200 | Number of Islands | 1 year | 0.070 | `secondphase/p10_graph_grid` |
| [ ] | 547 | Friend Circles | 1 year | 0.027 | `secondphase/p10_graph_grid` |
| [ ] | 101 | Symmetric Tree | 1 year | 0.021 | `thirdphase/g05_trees_and_graphs/s01_tree_bfs_dfs_shortest_path` |
| [ ] | 53 | Maximum Subarray | 1 year | 0.019 | `firstphase/set16_arrays_prefix; secondphase/p04_array_prefix_kadane; thirdphase/g09_dynamic_programming/s01_one_dimensional` |
| [ ] | 543 | Diameter of Binary Tree | 1 year | 0.012 | `secondphase/p09_trees` |
| [ ] | 78 | Subsets | 1 year | 0.008 | `thirdphase/g06_backtracking/s01_subsets_combinations_permutations` |
| [ ] | 121 | Best Time to Buy and Sell Stock | 1 year | 0.005 | `firstphase/set44_greedy_intervals; secondphase/p11_greedy_intervals; thirdphase/g02_two_pointers_sliding_window/s03_array_window` |
| [ ] | 199 | Binary Tree Right Side View | 2 years | 0.023 | `secondphase/p09_trees` |
| [ ] | 680 | Valid Palindrome II | 2 years | 0.016 | `secondphase/p02_two_pointers` |
| [ ] | 21 | Merge Two Sorted Lists | 2 years | 0.009 | `firstphase/set35_linked_list; secondphase/p08_linked_list; thirdphase/g04_linked_list/s01_reverse_merge_add` |
| [ ] | 215 | Kth Largest Element in an Array | 2 years | 0.009 | `firstphase/set50_heap; secondphase/p13_heap_sorting; thirdphase/g08_heap_and_intervals/s01_heap_top_k_and_merge` |
| [ ] | 136 | Single Number | 2 years | 0.006 | `secondphase/p14_bit_math` |
| [ ] | 56 | Merge Intervals | 2 years | 0.003 | `secondphase/p11_greedy_intervals; thirdphase/g08_heap_and_intervals/s02_intervals_greedy` |
