# [Missing Number](https://leetcode.com/problems/missing-number/)

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the only number in the range that is missing from the array.

## Attempt 1

### Brute-force

* Notice that `n` is the size of the array. We must look for the number missing in `[0, n]`, i.e., `[0, nums.size]`.
* We can simply check if a number in `[0, nums.size]` is missing from `nums` and return it.
* Since we must return something outside the for loop, might as well return `nums.size` for something like `[0, 1]`, for example.

### APIs

* All APIs in this attempt have already been covered in [Contains Duplicate](https://github.com/imashnake0/leetcode/blob/main/problems/217_Contains_Duplicate/README.md#contains-duplicate).

### TODO

* [ ] How do I identify which data structure to use in this case?

## Attempt 2

* This solution uses the fact that the only difference between `nums` and `[0, n]` is that there is one missing number.
* We can find the difference between the sum of all elements in each array to find the missing number.
* To find the sum of all elements in `nums`, we can use the `sum()` method; for `[0, n]` we know that only the non-zero integers from `0` to `n` contribute to the sum, which is given by `n(n + 1)/2` (sum of n integers formula in Calculus I).
* Then we return the difference.

### APIs

* [`sum()`](https://github.com/JetBrains/kotlin/blob/6a670dc5f38fc73eb01d754d8f7c158ae0176ceb/libraries/stdlib/common/src/generated/_Arrays.kt#L23763) is a method that wasn't used before. It just returns the sum of all integers in the array.

### TODO

* [ ] Although this is two times as fast as [Attempt 1](#attempt-1) and more concise, it is slower than 3/4<sup>th</sup> of the solutions. As before, we still need to find a suitable data structure to use.

## Solution

* Even though the [Attempt 2](#attempt-2) was seemingly slow, this was only because of how the [submission times are inconsistent](https://leetcode.com/discuss/general-discussion/136683/different-run-time-with-same-code).
* I noticed this when most of the faster submissions were [Attempt 2](#attempt-2) or variations of it.
* We can't depend on leetcode submission results to judge the quality of our code anymore!
* The best path forward would be to continue to solve leetcode problems but also revisit all of them once we read through [CLRS](https://github.com/ontiyonke/book-1/blob/master/%5BALGORITHMS%5D%5BIntroduction%20to%20Algorithms.%20Third%20Edition%5D.pdf).

### TODO

* [ ] Start reading [CLRS](https://github.com/ontiyonke/book-1/blob/master/%5BALGORITHMS%5D%5BIntroduction%20to%20Algorithms.%20Third%20Edition%5D.pdf). Notes for this will be in the `../../clrs` directory.
* [ ] Try to make sense of [Leetcode Patterns](https://seanprashad.com/leetcode-patterns/)' Tips: <br>

```markdown
If input array is sorted then
- Binary search
- Two pointers

If asked for all permutations/subsets then
- Backtracking

If given a tree then
- DFS
- BFS

If given a graph then
- DFS
- BFS

If given a linked list then
- Two pointers

If recursion is banned then
- Stack

If must solve in-place then
- Swap corresponding values
- Store one or more different values in the same pointer

If asked for maximum/minumum subarray/subset/options then
- Dynamic programming

If asked for top/least K items then
- Heap

If asked for common strings then
- Map
- Trie

Else
- Map/Set for O(1) time & O(n) space
- Sort input for O(nlogn) time and O(1) space
```
