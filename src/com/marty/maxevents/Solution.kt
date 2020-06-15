package com.marty.maxevents

import java.util.*

class Solution {
    fun maxEvents(events: Array<IntArray>): Int {
        val set = hashSetOf<Int>()
        Arrays.sort(events) { a, b ->
            when {
                a[1] == b[1] -> a[0] - b[0]
                else -> a[1] - b[1]
            }
        }
        events.forEachIndexed { i, _ ->
            for (j in events[i][0]..events[i][1]) {
                println("evaluating event: $j")
                if (set.add(j)) {
                    break
                }
            }
        }
        return set.size
    }
}