class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] arr = new int[k][2];
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) ->{
                int d1 = a[0]*a[0]+a[1]*a[1];
                int d2 = b[0]*b[0]+b[1]*b[1];

                if(d1!=d2){
                    return d1-d2;
                }
                if(a[0]!=b[0]){
                    return a[0]-b[0];
                }
                return a[1]-b[1];
            }
        );

        for(int[] num:points){
            pq.add(num);
        }

        for(int i=0;i<k;i++){
            arr[i] = pq.poll();
        }
        return arr;
    }
}