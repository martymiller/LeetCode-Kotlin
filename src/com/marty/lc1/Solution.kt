package com.marty.lc1

/**

    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    Example

    Given nums = [2, 7, 11, 15], target = 9,

    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].

**/

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray =
        nums.apply {
            val numMap = hashMapOf<Int, Int>()
            forEachIndexed { index, value ->
                if(numMap.containsKey(target - value)) {
                    return intArrayOf(numMap[target - value]!!, index)
                }
                else {
                    numMap[value] = index
                }
            }.also { return intArrayOf() }
        }
}