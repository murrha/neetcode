/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        
        /*
            from the input that after the first value, the next pair of values are the siblings/children
            if there are null values, it indicates either that the node is a leaf or has only 1 child
            depth includes the root node
            
            special cases: if the root is null, by itself, or just has their children who are leaves
            
            if the root is null or its left and right values are null then return 1
            
            there needs to be exactly 2 null values next to each other to indicate that it's a leaf
            
            if root.left is not null or root.right is not null 
                increment counter value
                
        */
        
        if(root == null) return 0;
        if(root.right == null && root.left == null) return 1; 
        
        int rightVal = 0, leftVal = 0, counter = 0;
        
        if(root.right != null || root.left != null){
            counter++;
            rightVal = maxDepth(root.right);
            leftVal = maxDepth(root.left);
        }
        
        return (rightVal > leftVal) ? rightVal + counter: leftVal + counter; 
        
    }
} 

/*
time complexity: O(n) since we are calling it recursively
space complexity: O(n) height of the tree, worst case of O(n) if the binary tree isn't balanced
*/