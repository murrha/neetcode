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
    
    //helper function
    private int tracker(TreeNode node, int currentMin, int currentMax){
        
        //if we find no node
        if(node == null){
            //calculate difference
            return currentMax - currentMin;
        }
        
        //else we continue traversing
        //find the min and max to replace with current ones
        currentMin = Math.min(currentMin, node.val);
        currentMax = Math.max(currentMax, node.val);
        
        //get the values on either side of subtrees
        int left = tracker(node.left, currentMin, currentMax);
        int right = tracker(node.right, currentMin, currentMax);
        
        //return the higher value
        return Math.max(left, right);
    }
    
    public int maxAncestorDiff(TreeNode root) {
        
        int result = tracker(root, root.val, root.val);
        
        return result; 
        
    }
}