import java.util.*;

class Solution {
    public int[] findRedundantConnection(int[][] edges) {

        int n = edges.length;
        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] e : edges){

            int u = e[0];
            int v = e[1];

            if(hasPath(u,v,adj,n)){
                return e;
            }

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        return new int[]{};
    }

    public boolean hasPath(int src,int dest,List<List<Integer>> adj,int n){

        boolean[] visited = new boolean[n+1];
        Queue<Integer> q = new LinkedList<>();

        q.add(src);
        visited[src] = true;

        while(!q.isEmpty()){

            int node = q.poll();

            if(node==dest) return true;

            for(int nei: adj.get(node)){
                if(!visited[nei]){
                    visited[nei]=true;
                    q.add(nei);
                }
            }
        }

        return false;
    }
}