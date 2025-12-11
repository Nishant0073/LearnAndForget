1. What Streams are (short & precise)

A Stream in Java is a sequence of elements supporting declarative, functional-style operations (map, filter, reduce, collect, etc.). Streams do not store data; they operate on a source (collections, arrays, I/O lines, generator). Streams are one-shot (consumed once). Operations are either intermediate (lazy — return a Stream) or terminal (eager — produce a result).

Key benefits:

Expressive pipeline-style code

Easy parallelization (parallelStream() / stream().parallel())

Composable transformations and aggregations

2. Basic pipeline anatomy

Source: List<T>, T[], Stream.of(...), Files.lines(path), IntStream.range(...)

Intermediate operations: filter, map, flatMap, distinct, sorted, peek, limit, skip

Terminal operations: collect, forEach, reduce, count, anyMatch, allMatch, noneMatch, findFirst, findAny, toArray

Example:

List<String> names = List.of("Alice","Bob","Charlie","David");
long count = names.stream()
                  .filter(s -> s.length() <= 4)   // intermediate (lazy)
                  .map(String::toUpperCase)       // intermediate (lazy)
                  .count();                       // terminal (executes pipeline)

3. Types of Streams

Reference streams: Stream<T>

Primitive specializations: IntStream, LongStream, DoubleStream — avoid boxing/unboxing overhead

Parallel streams: collection.parallelStream() or stream().parallel() — use carefully

4. Common intermediate operations (what they do)

filter(Predicate<? super T>) — keep elements matching predicate

map(Function<? super T,? extends R>) — transform element to another value

flatMap(Function<? super T,? extends Stream<? extends R>>) — map to streams and flatten

distinct() — remove duplicates (based on equals)

sorted() / sorted(Comparator) — sort elements

peek(Consumer<? super T>) — debugging/side-effects (use sparingly)

limit(n), skip(n) — truncate or skip prefix

5. Common terminal operations

collect(Collector<? super T,A,R>) — the most general; common collectors in Collectors utility

Collectors.toList(), toSet(), toCollection(...), toMap(keyMapper, valueMapper), joining(), groupingBy(), partitioningBy(), mapping(), counting(), summarizingInt(), summarizingDouble(), averagingInt(), reducing(), collectingAndThen()

forEach(Consumer) / forEachOrdered — beware side effects with parallel streams

reduce(...) — fold elements

count(), max(Comparator), min(Comparator), anyMatch, allMatch, noneMatch, findFirst, findAny, toArray
