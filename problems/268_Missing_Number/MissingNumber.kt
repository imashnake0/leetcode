/** Attempt 1 */
/*
class MissingNumber {
    fun missingNumber(nums: IntArray): Int {
        for(i in 0..nums.size) {
            if(i !in nums) return i
        }
        return nums.size
    }
}
*/

/** Attempt 2 */
class MissingNumber {
    fun missingNumber(nums: IntArray): Int {
        val n = nums.size
        return n * (n + 1)/2 - nums.sum()
    }
}
