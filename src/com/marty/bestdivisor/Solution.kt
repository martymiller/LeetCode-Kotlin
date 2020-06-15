package com.marty.bestdivisor

import java.util.*

class Solution {

    fun getDivisors(n: Int): List<Int> {
        val result = mutableListOf<Int>()
        for(i in 1..n) {
            if(n % i == 0) {
                result.add(i)
            }
        }
        return Collections.unmodifiableList(result)
    }

    fun getSumOfDigits(n: Int): Int {
        var sum = 0
        var num = n
        while(num > 0) {
            sum += num%10
            num /= 10
        }
        return sum
    }

    fun bestDivisor(n: Int): Int {
        var maxSum: Int = 0
        var bestNumber: Int = 0
        val divisors: List<Int> = getDivisors(n)
        divisors.forEach { currentNumber ->
            val currentSum = getSumOfDigits(currentNumber)
            if(currentSum > maxSum) {
                maxSum = currentSum
                bestNumber = currentNumber
            }
            else {
                if(maxSum == currentSum && currentNumber < bestNumber) {
                    bestNumber = currentNumber
                }
            }
        }
        return bestNumber
    }
}