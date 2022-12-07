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
    public TreeNode searchBST(TreeNode root, int val) {
        
        //check if the root is already null / can also take into account leaves
        if(root == null) return null;
        
        //check if the root has the value
        if(root.val == val){
            return root; 
        }else{
            
            //return either left or right while calling the function on left and right sides
            return val < root.val ? searchBST(root.left, val) : searchBST(root.right,val); 
        }
        
    }
}