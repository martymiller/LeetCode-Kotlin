package com.marty

import com.marty.lc412.Solution

fun main() {
    com.marty.lc412.Solution().fizzBuzz(15).forEachIndexed { index, value ->
        println("$index: $value")
    }
}