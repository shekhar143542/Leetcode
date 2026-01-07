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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int level = 0;
        int l = 0;
        q.add(root);

        while(!q.isEmpty()){
            int n = q.size();
            sum = 0;
            for(int i=0;i<n;i++){
                TreeNode value = q.poll();
                if(value.left != null){
                    q.add(value.left);
                }
                if(value.right != null){
                    q.add(value.right);
                }
                sum+=value.val;
            }
            l++;
            if(sum>max){
                max = sum;
                level = l;
            }
        }
        return level;
    }
}