class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        int count = 0;

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));
        
        int[] cur = intervals[0];
        for(int i=1;i<n;i++){
            int[] next = intervals[i];
            int start = cur[0];
            int end = cur[1];
            int nextstart = next[0];
            int nextend = next[1];

            if(nextstart<end){
                count++;
            }else{
                cur = next;
            }
        }

        return count;
        
    }
}