/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
         if(root == null) return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int n = q.size();
            int count = 1;
            Node prev = q.poll();
            if(prev.left != null) q.add(prev.left);
            if(prev.right != null) q.add(prev.right);
            for(int i=1;i<n;i++){
                Node cur = q.poll();
                if(cur.left!=null) q.add(cur.left);
                if(cur.right != null) q.add(cur.right);
                if(count == n) cur.right = null;
                prev.next = cur;
                prev = cur;
                count++;
            }
        }
        return root;
    }
}