package com.marty.lc98

/**
    Given a binary tree, determine if it is a valid binary search tree (BST).

    Assume a BST is defined as follows:
    The left subtree of a node contains only nodes with keys less than the node's key.
    The right subtree of a node contains only nodes with keys greater than the node's key.
    Both the left and right subtrees must also be binary search trees.
**/

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
class Solution {

    fun isValidBST(root: TreeNode?): Boolean {

        fun isValidNode(node: TreeNode?, lower: Int?, upper: Int?): Boolean {
            if(node == null) {
                return true
            }

            val value = node.`val`

            if(lower != null && value <= lower) return false
            if(upper != null && value >= upper) return false

            if(!isValidNode(node.left, lower, value)) return false
            if(!isValidNode(node.right, value, upper)) return false

            return true
        }
        return isValidNode(root, null, null)
    }
}
