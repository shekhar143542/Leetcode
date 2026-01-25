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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root == null) return list;

        pathdfs(root, "", list);

        return list;
    }

    public void pathdfs(TreeNode root, String path, List<String> ans){

            path+=root.val;

        if(root.left == null && root.right == null){
            ans.add(path);
            return;
        }

        if(root.left != null){
            pathdfs(root.left, path+"->", ans);
        }

        if(root.right != null){
            pathdfs(root.right, path+"->", ans);
        }
    }
}