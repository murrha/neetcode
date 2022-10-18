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
    public TreeNode invertTree(TreeNode root) {
        
        /*
            the ancestor/top most root is the same
            its children will be inverted along with their own children
            binary search tree
            
            special cases: recursively, optimal solution to be looking for
            
            if the root is empty, return the empty root
            
            switch the placement of the right and left children
            then perform the same actions with the children's children
            
            tree - level by level to indicate the children
            
            temporary node to keep the value
            
            temp node set to root.left
            root.left switches with root.right
            root.right = temp
            
            
        */
        
        if(root == null) return root; 
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp; 
        
        invertTree(root.left);
        invertTree(root.right); 
        
        return root; 
        
    }
}

/*
time complexity: O(n) since it depends on the number of nodes that are present in the binary tree
space complexity: O(n) worst case scenario if all the children just has one children so have to count the null values in the stack
*/