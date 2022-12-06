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
    
    //depth first search
    private void dfs(TreeNode root, List<Integer> list){
        
        if(root != null){
            
            //if we encounter a leaf
            //right and left values are null
            if(root.right == null && root.left == null){
                //add their value to the list
                list.add(root.val);
            }
                
             //recursively call on other branches to see if we reach a leaf
            dfs(root.right, list);
            dfs(root.left, list);
        }    
    }
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        //create two arrayLists
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        //call on dfs to get values
        dfs(root1, list1);
        dfs(root2, list2);
        
        //returns boolean if they are equal to each other
        return list1.equals(list2); 
    }
}