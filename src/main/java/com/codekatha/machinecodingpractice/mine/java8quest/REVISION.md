# Java 8 Quest - Revision List
2nd pass me sirf yahi questions aayenge (variation ke saath).

| Q# | Question | Yaad rakhne wali baat |
|----|----------|-----------------------|
| 1 | Create streams | `IntStream.range(0,5)` = 0..4, `rangeClosed(0,4)` = 0..4. `iterate(seed, rule)`, `generate(() -> value)`, dono me `.limit()` zaroori. Map ke liye `entrySet().stream()`. Array: `Arrays.stream(arr)`. |
| 8 | Min number | `min()/max()` me Comparator do: `Integer::compare`. `Integer::min` galat hai (aakhri element de deta hai). `reduce(...)` me `Integer::min/max` sahi. |
| 19 | flatMap | `flatMap` ke andar har element ka stream do: `list -> list.stream()` ya `List::stream`. `map` = 1 se 1, `flatMap` = 1 se kai, phir sab ek stream me. |
| 28 | Most frequent char | `chars()` IntStream deta hai: `collect(Collector)` ke liye `mapToObj(c -> (char) c)` se Stream<Character> banao. Map ka max: `entrySet().stream().max(Map.Entry.comparingByValue())`. |
| 32 | Max frequency chars | `Long == Long` reference compare karta hai (bade value par galat). `.equals()` use karo ya `long` primitive me rakho. `0L` likho, `0l` nahi. |
| 33 | Moving average | Sliding window me start index `0..size-window` (dono shamil): `rangeClosed(0, size - window)` ya `range(0, size - window + 1)`. `subList(from, to)` me `to` shamil nahi. |
| 34 | Longest word | `replace()` literal text badalta hai, regex ke liye `replaceAll("[^a-z\\s]", "")`. Longest ke liye `max(Comparator.comparingInt(String::length))`, groupingBy nahi. |
| 37 | Highest spend day | Group ka total: `Collectors.summingDouble(...)` (summarizingDouble stats object deta hai). Sabse bada: `max(Map.Entry.comparingByValue())`. `.reversed()` chain karna ho to `Map.Entry.<K,V>comparingByValue().reversed()`. `mapToObj` sirf IntStream me, Stream me `map`. |
| 38 | Group by salary range | Group ke andar poora object nahi, sirf field chahiye to downstream: `groupingBy(key, Collectors.mapping(Employee::getName, Collectors.toList()))`. |
| 40 | 3+ departments | Har key ka ek hi row ho to `groupingBy` nahi, seedha `filter` ya `toMap`. `groupingBy` hamesha List banata hai (List<List<..>> ka jhanjhat). Unique count: `.distinct().count()`. |
