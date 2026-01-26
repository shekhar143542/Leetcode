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
    HashMap<Integer, Integer> map = new HashMap<>();
    int max = Integer.MIN_VALUE; 
    public int[] findMode(TreeNode root) {
    List<Integer> list = new ArrayList<>();
        preorder(root);
         for(int key:map.keySet()){
            if(map.get(key) == max){
                list.add(key);
            }
         }
         int[] arr = new int[list.size()];
         for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
         }



        return arr;
    }

    public void preorder(TreeNode root){
        if(root == null){
            return;
        }

        map.put(root.val, map.getOrDefault(root.val, 0)+1);
        max = Math.max(max, map.get(root.val));
        preorder(root.left);
        preorder(root.right);

    }
}