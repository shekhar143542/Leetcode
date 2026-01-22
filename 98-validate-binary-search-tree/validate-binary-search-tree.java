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
    long lag = Long.MIN_VALUE;
    boolean isbst = true;
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }

        isValidBST(root.left);
        if(root.val>lag){
            lag = root.val;
        }else{
            isbst = false;
        }
        isValidBST(root.right);

        return isbst;
    }
}