package com.marty.lc589

/**
    https://leetcode.com/problems/n-ary-tree-preorder-traversal/

    Given an n-ary tree, return the preorder traversal of its nodes' values.
    Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).

    Follow up:
    Recursive solution is trivial, could you do it iteratively?

    Example 1:

    Input: root = [1,null,3,2,4,null,5,6]
    Output: [1,3,5,6,2,4]
**/

class Node(var `val`: Int) {
    var children: List<Node?> = listOf()
}

class Solution {
    fun preorder(root: Node?): List<Int>? {
        return null
    }
}
