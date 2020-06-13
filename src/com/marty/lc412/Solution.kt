package com.marty.lc412

class Solution {

    fun fizzBuzz(n: Int): List<String> =
        mutableListOf<String>().apply {
            for (i in 1..n) {
                add(
                    StringBuilder().apply {
                        if (i % 3 == 0) append("Fizz")
                        if (i % 5 == 0) append("Buzz")
                        if (isEmpty()) append(i.toString())
                    }
                        .toString()
                )
            }
        }
}
