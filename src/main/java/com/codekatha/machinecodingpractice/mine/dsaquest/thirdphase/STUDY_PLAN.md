# DSA Quest - Phase 3: Atlassian Cheatsheet Plan

Source: `src/main/resources/atlassian-cheatsheet` (Round 1 OA + Round 2 F2F). Total **50** problems = **22 new** + **28 revision** (pehle firstphase/secondphase me aa chuke).

Structure: `thirdphase/gNN_<group>/sNN_<subgroup>/<Class>.java`. Group = pattern, subgroup = ek technique. Subgroup ke andar problems seekhne ke order me hain (cheatsheet level ke hisaab se nahi).

- **Cheatsheet level** = jo Atlassian sheet me likha hai (kuch LeetCode ke level se alag hai). **Round** = OA ya F2F.
- **New** = pehli baar. **Revision** = pehle kiya hua, ab bina dekhe solve karo (aur timing note karo).
- Har class me statement, link, hint (spoiler), TODO stub aur `main()` me self-checking tests hain. Premium wale pe link login maangega.

## Arrays & Hashing  (`g01_arrays_hashing`)

_Lookup table / frequency map se O(n^2) ko O(n) banao; matrix pe bhi wahi sets ki soch._

### Hash Map & Counting  (`s01_hash_map_counting`)

_Complement ya frequency map: 'kya ye pehle dekha?', 'kitni baar aaya?', 'same key = same group'._

| Done | # | Problem | Cheatsheet | Round | New/Revision | Class | Link |
|---|---|---|---|---|---|---|---|
| [ ] | 1 | Two Sum | Easy | Round 1 OA | Revision | `LC0001_TwoSum` | [LeetCode](https://leetcode.com/problems/two-sum/) |
| [ ] | 169 | Majority Element | Easy | Round 2 F2F | Revision | `LC0169_MajorityElement` | [LeetCode](https://leetcode.com/problems/majority-element/) |
| [ ] | 49 | Group Anagrams | Medium | Round 1 OA | Revision | `LC0049_GroupAnagrams` | [LeetCode](https://leetcode.com/problems/group-anagrams/) |

### Matrix Traversal & Validation  (`s02_matrix`)

_Row / column / box ke liye alag sets; spiral ke liye 4 boundaries; zero-marking ke liye first row/col ko flag banao._

| Done | # | Problem | Cheatsheet | Round | New/Revision | Class | Link |
|---|---|---|---|---|---|---|---|
| [ ] | 36 | Valid Sudoku | Medium | Round 1 OA | New | `LC0036_ValidSudoku` | [LeetCode](https://leetcode.com/problems/valid-sudoku/) |
| [ ] | 54 | Spiral Matrix | Medium | Round 2 F2F | Revision | `LC0054_SpiralMatrix` | [LeetCode](https://leetcode.com/problems/spiral-matrix/) |
| [ ] | 73 | Set Matrix Zeroes | Medium | Round 2 F2F | Revision | `LC0073_SetMatrixZeroes` | [LeetCode](https://leetcode.com/problems/set-matrix-zeroes/) |

## Two Pointers, Sliding Window & String Matching  (`g02_two_pointers_sliding_window`)

_Do index ek hi pass mein: opposite ends, ya expanding/shrinking window._

### Two Pointers (opposite ends)  (`s01_two_pointers`)

_Sorted / bounded array: chhoti side wala pointer hilao. 3Sum = sort + ek fix + two pointers._

| Done | # | Problem | Cheatsheet | Round | New/Revision | Class | Link |
|---|---|---|---|---|---|---|---|
| [ ] | 11 | Container With Most Water | Medium | Round 1 OA | Revision | `LC0011_ContainerWithMostWater` | [LeetCode](https://leetcode.com/problems/container-with-most-water/) |
| [ ] | 15 | 3Sum | Medium | Round 1 OA | Revision | `LC0015_3Sum` | [LeetCode](https://leetcode.com/problems/3sum/) |
| [ ] | 42 | Trapping Rain Water | Hard | Round 2 F2F | Revision | `LC0042_TrappingRainWater` | [LeetCode](https://leetcode.com/problems/trapping-rain-water/) |

### String Window & Pattern Matching  (`s02_string_window_and_matching`)

_Variable window (set/map), fixed window (freq array compare), aur KMP (prefix function) se O(n+m) matching._

| Done | # | Problem | Cheatsheet | Round | New/Revision | Class | Link |
|---|---|---|---|---|---|---|---|
| [ ] | 3 | Longest Substring Without Repeating Characters | Medium | Round 1 OA | Revision | `LC0003_LongestSubstringWithoutRepeatingCharacters` | [LeetCode](https://leetcode.com/problems/longest-substring-without-repeating-characters/) |
| [ ] | 438 | Find All Anagrams in a String | Medium | Round 1 OA | New | `LC0438_FindAllAnagramsInAString` | [LeetCode](https://leetcode.com/problems/find-all-anagrams-in-a-string/) |
| [ ] | 28 | Find the Index of the First Occurrence in a String | Easy | Round 1 OA | Revision | `LC0028_FindTheIndexOfTheFirstOccurrenceInAString` | [LeetCode](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/) |

### Array Window  (`s03_array_window`)

_Running min (stock) aur monotonic deque (window max): har element ek hi baar push/pop._

| Done | # | Problem | Cheatsheet | Round | New/Revision | Class | Link |
|---|---|---|---|---|---|---|---|
| [ ] | 121 | Best Time to Buy and Sell Stock | Easy | Round 2 F2F | Revision | `LC0121_BestTimeToBuyAndSellStock` | [LeetCode](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) |
| [ ] | 239 | Sliding Window Maximum | Hard | Round 1 OA | Revision | `LC0239_SlidingWindowMaximum` | [LeetCode](https://leetcode.com/problems/sliding-window-maximum/) |

## Stack & Design  (`g03_stack_and_design`)

_LIFO matching/evaluation, aur O(1) data structure design (hash + linked list), plus low-level design rounds._

### Stack Applications  (`s01_stack_applications`)

_Matching brackets, expression evaluation, index-stack for longest valid substring._

| Done | # | Problem | Cheatsheet | Round | New/Revision | Class | Link |
|---|---|---|---|---|---|---|---|
| [ ] | 20 | Valid Parentheses | Easy | Round 1 OA | Revision | `LC0020_ValidParentheses` | [LeetCode](https://leetcode.com/problems/valid-parentheses/) |
| [ ] | 150 | Evaluate Reverse Polish Notation | Medium | Round 2 F2F | Revision | `LC0150_EvaluateReversePolishNotation` | [LeetCode](https://leetcode.com/problems/evaluate-reverse-polish-notation/) |
| [ ] | 32 | Longest Valid Parentheses | Hard | Round 2 F2F | New | `LC0032_LongestValidParentheses` | [LeetCode](https://leetcode.com/problems/longest-valid-parentheses/) |

### Data Structure Design  (`s02_data_structure_design`)

_Min Stack (extra stack ya pair), Design HashMap (buckets + chaining), LRU (HashMap + doubly linked list)._

| Done | # | Problem | Cheatsheet | Round | New/Revision | Class | Link |
|---|---|---|---|---|---|---|---|
| [ ] | 155 | Min Stack | Easy | Round 2 F2F | Revision | `LC0155_MinStack` | [LeetCode](https://leetcode.com/problems/min-stack/) |
| [ ] | 706 | Design HashMap | Medium | Round 1 OA | New | `LC0706_DesignHashMap` | [LeetCode](https://leetcode.com/problems/design-hashmap/) |
| [ ] | 146 | LRU Cache | Medium | Round 2 F2F | Revision | `LC0146_LRUCache` | [LeetCode](https://leetcode.com/problems/lru-cache/) |

### LLD / System-flavoured Coding (non-LeetCode)  (`s03_system_design_lld`)

_Interview mein clean class design: interface, edge cases, thread-safety discussion. Cheatsheet ke title se banaye gaye._

| Done | # | Problem | Cheatsheet | Round | New/Revision | Class | Link |
|---|---|---|---|---|---|---|---|
| [ ] | - | Rate Limiter (Basic Version) | Easy | Round 1 OA | New | `Design_RateLimiter` | (design item) |
| [ ] | - | Leader Election with Variations | Medium | Round 1 OA | New | `Design_LeaderElection` | (design item) |

## Linked List  (`g04_linked_list`)

_Dummy node, pointer rewiring, fast-slow pointers._

### Reverse / Merge / Add  (`s01_reverse_merge_add`)

_Dummy head + tail pointer; reverse = prev/cur/next teen pointers; add = carry ke saath digit-wise._

| Done | # | Problem | Cheatsheet | Round | New/Revision | Class | Link |
|---|---|---|---|---|---|---|---|
| [ ] | 206 | Reverse Linked List | Easy | Round 2 F2F | Revision | `LC0206_ReverseLinkedList` | [LeetCode](https://leetcode.com/problems/reverse-linked-list/) |
| [ ] | 21 | Merge Two Sorted Lists | Easy | Round 1 OA | Revision | `LC0021_MergeTwoSortedLists` | [LeetCode](https://leetcode.com/problems/merge-two-sorted-lists/) |
| [ ] | 2 | Add Two Numbers | Medium | Round 1 OA | Revision | `LC0002_AddTwoNumbers` | [LeetCode](https://leetcode.com/problems/add-two-numbers/) |

### Cycle & Palindrome (fast-slow)  (`s02_cycle_and_palindrome`)

_Fast-slow: cycle detect, middle dhoondo, second half reverse karke compare._

| Done | # | Problem | Cheatsheet | Round | New/Revision | Class | Link |
|---|---|---|---|---|---|---|---|
| [ ] | 141 | Linked List Cycle | Easy | Round 2 F2F | Revision | `LC0141_LinkedListCycle` | [LeetCode](https://leetcode.com/problems/linked-list-cycle/) |
| [ ] | 234 | Palindrome Linked List | Easy | Round 2 F2F | Revision | `LC0234_PalindromeLinkedList` | [LeetCode](https://leetcode.com/problems/palindrome-linked-list/) |

## Trees & Graphs  (`g05_trees_and_graphs`)

_BFS / DFS, topological sort, shortest path._

### Tree DFS, Graph BFS & Shortest Path  (`s01_tree_bfs_dfs_shortest_path`)

_Mirror check = do pointers recursion; Word Ladder = BFS (unweighted shortest path); Find the City = Floyd-Warshall / Dijkstra._

| Done | # | Problem | Cheatsheet | Round | New/Revision | Class | Link |
|---|---|---|---|---|---|---|---|
| [ ] | 101 | Symmetric Tree | Easy | Round 2 F2F | New | `LC0101_SymmetricTree` | [LeetCode](https://leetcode.com/problems/symmetric-tree/) |
| [ ] | 127 | Word Ladder | Medium | Round 2 F2F | New | `LC0127_WordLadder` | [LeetCode](https://leetcode.com/problems/word-ladder/) |
| [ ] | 1334 | Find the City With the Smallest Number of Neighbors at a Threshold Distance | Medium | Round 1 OA | New | `LC1334_FindTheCity` | [LeetCode](https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/) |

### Topological Sort (Kahn / DFS)  (`s02_topological_sort`)

_Dependency graph: indegree + queue. Cycle = poora order nahi bana._

| Done | # | Problem | Cheatsheet | Round | New/Revision | Class | Link |
|---|---|---|---|---|---|---|---|
| [ ] | 207 | Course Schedule | Medium | Round 2 F2F | Revision | `LC0207_CourseSchedule` | [LeetCode](https://leetcode.com/problems/course-schedule/) |
| [ ] | 269 | Alien Dictionary (Premium) | Hard | Round 2 F2F | New | `LC0269_AlienDictionary` | [LeetCode](https://leetcode.com/problems/alien-dictionary/) |

## Backtracking  (`g06_backtracking`)

_Choose -> explore -> un-choose. Pruning se time bachta hai._

### Subsets, Combinations & Permutations  (`s01_subsets_combinations_permutations`)

_Subsets = har element include/exclude. Combination Sum = same element dobara allowed (start index). Permutations = used[] array._

| Done | # | Problem | Cheatsheet | Round | New/Revision | Class | Link |
|---|---|---|---|---|---|---|---|
| [ ] | 78 | Subsets | Medium | Round 1 OA | New | `LC0078_Subsets` | [LeetCode](https://leetcode.com/problems/subsets/) |
| [ ] | 39 | Combination Sum | Medium | Round 1 OA | New | `LC0039_CombinationSum` | [LeetCode](https://leetcode.com/problems/combination-sum/) |
| [ ] | 46 | Permutations | Medium | Round 2 F2F | New | `LC0046_Permutations` | [LeetCode](https://leetcode.com/problems/permutations/) |

### Board / Grid Search  (`s02_board_and_grid_search`)

_Grid pe DFS + visited mark/unmark; Word Search II = Trie se saare words ek saath; N-Queens = column/diagonal sets._

| Done | # | Problem | Cheatsheet | Round | New/Revision | Class | Link |
|---|---|---|---|---|---|---|---|
| [ ] | 79 | Word Search | Medium | Round 1 OA | New | `LC0079_WordSearch` | [LeetCode](https://leetcode.com/problems/word-search/) |
| [ ] | 51 | N-Queens | Hard | Round 1 OA | New | `LC0051_NQueens` | [LeetCode](https://leetcode.com/problems/n-queens/) |
| [ ] | 212 | Word Search II | Hard | Round 1 OA | New | `LC0212_WordSearchII` | [LeetCode](https://leetcode.com/problems/word-search-ii/) |

## Binary Search & Halving  (`g07_binary_search_and_halving`)

_Har step pe problem aadhi: sorted/rotated array, partition point, power by squaring._

### Binary Search & Halving  (`s01_binary_search_and_halving`)

_Rotated array mein sorted half pehchano; median = chhote array pe partition search; Pow = n ko aadha karte jao._

| Done | # | Problem | Cheatsheet | Round | New/Revision | Class | Link |
|---|---|---|---|---|---|---|---|
| [ ] | 33 | Search in Rotated Sorted Array | Medium | Round 2 F2F | Revision | `LC0033_SearchInRotatedSortedArray` | [LeetCode](https://leetcode.com/problems/search-in-rotated-sorted-array/) |
| [ ] | 4 | Median of Two Sorted Arrays | Hard | Round 1 OA | New | `LC0004_MedianOfTwoSortedArrays` | [LeetCode](https://leetcode.com/problems/median-of-two-sorted-arrays/) |
| [ ] | 50 | Pow(x, n) | Medium | Round 1 OA | New | `LC0050_PowXN` | [LeetCode](https://leetcode.com/problems/powx-n/) |

## Heap & Intervals  (`g08_heap_and_intervals`)

_PriorityQueue se top-K / k-way merge; sort + greedy sweep intervals ke liye._

### Heap: Top-K & K-way Merge  (`s01_heap_top_k_and_merge`)

_Size-K min-heap (Kth largest, top K frequent); k lists ka merge = heap mein har list ka head._

| Done | # | Problem | Cheatsheet | Round | New/Revision | Class | Link |
|---|---|---|---|---|---|---|---|
| [ ] | 347 | Top K Frequent Elements | Medium | Round 2 F2F | Revision | `LC0347_TopKFrequentElements` | [LeetCode](https://leetcode.com/problems/top-k-frequent-elements/) |
| [ ] | 215 | Kth Largest Element in an Array | Medium | Round 2 F2F | Revision | `LC0215_KthLargestElementInAnArray` | [LeetCode](https://leetcode.com/problems/kth-largest-element-in-an-array/) |
| [ ] | 23 | Merge k Sorted Lists | Hard | Round 2 F2F | New | `LC0023_MergeKSortedLists` | [LeetCode](https://leetcode.com/problems/merge-k-sorted-lists/) |

### Intervals (sort + greedy)  (`s02_intervals_greedy`)

_Start ya end se sort karke ek sweep; overlap = current.start <= last.end._

| Done | # | Problem | Cheatsheet | Round | New/Revision | Class | Link |
|---|---|---|---|---|---|---|---|
| [ ] | 56 | Merge Intervals | Medium | Round 1 OA | Revision | `LC0056_MergeIntervals` | [LeetCode](https://leetcode.com/problems/merge-intervals/) |
| [ ] | 757 | Set Intersection Size At Least Two | Hard | Round 1 OA | New | `LC0757_SetIntersectionSizeAtLeastTwo` | [LeetCode](https://leetcode.com/problems/set-intersection-size-at-least-two/) |

## Dynamic Programming  (`g09_dynamic_programming`)

_State, transition, base case. 1D se 2D tak._

### 1D DP  (`s01_one_dimensional`)

_dp[i] sirf pichhle 1-2 states pe depend: Climbing Stairs, Kadane, Decode Ways._

| Done | # | Problem | Cheatsheet | Round | New/Revision | Class | Link |
|---|---|---|---|---|---|---|---|
| [ ] | 70 | Climbing Stairs | Easy | Round 1 OA | Revision | `LC0070_ClimbingStairs` | [LeetCode](https://leetcode.com/problems/climbing-stairs/) |
| [ ] | 53 | Maximum Subarray | Easy | Round 1 OA | Revision | `LC0053_MaximumSubarray` | [LeetCode](https://leetcode.com/problems/maximum-subarray/) |
| [ ] | 91 | Decode Ways | Medium | Round 2 F2F | New | `LC0091_DecodeWays` | [LeetCode](https://leetcode.com/problems/decode-ways/) |

### 2D DP (two strings)  (`s02_two_dimensional`)

_dp[i][j] = word1 ke pehle i aur word2 ke pehle j characters ka answer._

| Done | # | Problem | Cheatsheet | Round | New/Revision | Class | Link |
|---|---|---|---|---|---|---|---|
| [ ] | 72 | Edit Distance | Hard | Round 2 F2F | New | `LC0072_EditDistance` | [LeetCode](https://leetcode.com/problems/edit-distance/) |

## Round-wise quick index

- **Round 1 OA / Easy** (7): Two Sum (#1), Find the Index of the First Occurrence in a String (#28), Valid Parentheses (#20), Rate Limiter (Basic Version), Merge Two Sorted Lists (#21), Climbing Stairs (#70), Maximum Subarray (#53)
- **Round 1 OA / Medium** (15): Group Anagrams (#49), Valid Sudoku (#36), Container With Most Water (#11), 3Sum (#15), Longest Substring Without Repeating Characters (#3), Find All Anagrams in a String (#438), Design HashMap (#706), Leader Election with Variations, Add Two Numbers (#2), Find the City With the Smallest Number of Neighbors at a Threshold Distance (#1334), Subsets (#78), Combination Sum (#39), Word Search (#79), Pow(x, n) (#50), Merge Intervals (#56)
- **Round 1 OA / Hard** (5): Sliding Window Maximum (#239), N-Queens (#51), Word Search II (#212), Median of Two Sorted Arrays (#4), Set Intersection Size At Least Two (#757)
- **Round 2 F2F / Easy** (7): Majority Element (#169), Best Time to Buy and Sell Stock (#121), Min Stack (#155), Reverse Linked List (#206), Linked List Cycle (#141), Palindrome Linked List (#234), Symmetric Tree (#101)
- **Round 2 F2F / Medium** (11): Spiral Matrix (#54), Set Matrix Zeroes (#73), Evaluate Reverse Polish Notation (#150), LRU Cache (#146), Word Ladder (#127), Course Schedule (#207), Permutations (#46), Search in Rotated Sorted Array (#33), Top K Frequent Elements (#347), Kth Largest Element in an Array (#215), Decode Ways (#91)
- **Round 2 F2F / Hard** (5): Trapping Rain Water (#42), Longest Valid Parentheses (#32), Alien Dictionary (#269), Merge k Sorted Lists (#23), Edit Distance (#72)
