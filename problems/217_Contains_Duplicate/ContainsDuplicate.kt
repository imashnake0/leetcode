// Attempt 1
/*
class ContainsDuplicate() {
    fun containsDuplicate(nums: IntArray): Boolean {
        var sum = 0
        for (i in 0 until nums.size) {
            for (j in 0 until nums.size) {
                if(nums[i] == nums[j]) {
                    sum++
                }
            }
        }
        if (sum > nums.size) {
            return true
        }
        return false
    }
}
*/

// Attempt 2
/*
class ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        val numsSorted = nums.sortedArray()
        for (i in 0 until numsSorted.lastIndex) {
            if (numsSorted[i] == numsSorted[i + 1]) {
                return true
            }
        }
        return false
    }
}
*/

// Attempt 3
class ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        val numsSet = nums.toSet()
        if(numsSet.size == nums.size) {
            return false
        }
        return true
    }
}

// Solution
/*
class ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        val memory = HashSet<Int>()
        for (num in nums) {
            if (!memory.add(num)) {
                return true
            }
        }
        return false
    }
}
*/
