# [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)

Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

## Attempt 1

### Brute-force

* My initial line of thought was to simply check if for every number in `nums`, the number appeared twice in `nums`. If it did, return `true` else `false`.
* This involved going through the array twice, and if `sum` was more than the size of the array then that means that *a* number appeared twice. This is because the numbers already exist once and each element would contribute 1 to `sum`.

### APIs

* There are two types of arrays in Kotlin, [`IntArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/#array) and [`Array<Int>`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/#array). The first corresponds to `int[]` and the second corresponds to `Integer[]` in Java.
* The first type is only for [primitive types](https://kotlinlang.org/docs/basic-types.html) and is hence much faster.
* To initialize an `IntArray`, for example, we do `val intArray = IntArray(5) { it }` or `val intArray = IntArray(5) = intArrayOf(0, 1, 2, 3, 4)` (using the factory method); for `Array<Int>`, we do `Array<Int>(5) { it }`.
* `size` is a property of arrays ([collections](https://kotlinlang.org/docs/collections-overview.html)?) that returns the size of the Array.
* `until` returns a range *until* the last value, i.e., `1..5` is the same as `1 until 6`.

### TODO

* [ ] Get a better understanding of how [lambda expressions and higher-order](https://kotlinlang.org/docs/lambdas.html) functions work.
  * Watch [Java 8 Lambda Basics](https://www.youtube.com/playlist?list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3).
* [ ] Understand [ranges and progressions](https://kotlinlang.org/docs/ranges.html) better.

## Attempt 2

* This was based on [Attempt 1](#attempt-1) but was with a sorted array. This made it so that we had to go through the array only once.
* After sorting, we simply check if an element occurs consecutively in the array and return `true` if it does (or else `false`).

### APIs

* Arrays (and collections) have methods to sort them. In this case, we can use [`sortedArray()`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/sorted-array.html) to... sort `nums`.
* `lastIndex` returns `size - 1`.

### TODO

* [ ] Take a closer look at the [different sort methods](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/).

## Attempt 3

* Things kind of clicked when I remembered that sets existed.
* We can easily convert from an array to a set using [`toSet()`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.sequences/to-set.html) (and from collection to collection?).
* If the number of elements changes, we can confidently say that there was a duplicate element.

### APIs

* [`toSet()`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/to-set.html) was the only new method that was used in this attempt.

### TODO

* [ ] See if `toSet()` applies to all collections, i.e., if you can convert from one collection to another and what the constraints are.

## Solution

* There is a more elegant way of writing [Attempt 3](#attempt-3), instead of having an if-else statement that evaluates a boolean and also returns `true` or `false` depending on the value, we can simply return the boolean, like so:
```kotlin
fun containsDuplicate(nums: IntArray): Boolean = nums.toSet().size != nums.size
```
* There are faster solutions that make use of a [`HashMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-hash-map/).

### TODO

* [ ] Reading: Go through [collections that are a part of the Kotlin standard library](https://kotlinlang.org/docs/collections-overview.html).
* [ ] Reading: Go through relevant sections in [CLRS](https://github.com/ontiyonke/book-1/blob/master/%5BALGORITHMS%5D%5BIntroduction%20to%20Algorithms.%20Third%20Edition%5D.pdf).
* [ ] Finally, revisit this problem and solve using a HashMap.
