package com.marty.slowestkey

// HackerRank problem

class Solution {

    fun findSlowestKey(): Int {
        val keySet = arrayOf(0 to 2, 1 to 5, 0 to 9, 2 to 15)
        var currentLongestKey = keySet.first().first
        var currentLongestTime = keySet.first().second

        for (index in 1 until keySet.size) {
            val pair = keySet[index]
            val keyTime = pair.second - keySet[index - 1].second
            if (keyTime > currentLongestTime) {
                currentLongestTime = keyTime
                currentLongestKey = pair.first
            }
        }
        return currentLongestKey
    }
}