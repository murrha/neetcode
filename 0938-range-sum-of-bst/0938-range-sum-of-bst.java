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
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        //hold our final value
        int sum = 0;
        
        //checks if the root is within the range
        if(root.val >= low && root.val <= high) 
            //add to our sum
            sum += root.val;
        
        //checks for right side
        if(root.right != null){
            //add to our sum
            sum += rangeSumBST(root.right, low, high);
        }
        
        //checks for the left side
        if(root.left != null){
            sum+= rangeSumBST(root.left, low, high);
        }
        
        
        return sum;
    }
}