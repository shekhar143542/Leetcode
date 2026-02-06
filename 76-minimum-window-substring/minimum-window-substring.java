class Solution {
    public String minWindow(String s, String t) {
         int n = s.length();
         int m = t.length();
         int l = 0;
         int start = -1;
         int r = 0;
         int minlen = Integer.MAX_VALUE;
         int count = 0;

         int[] hash = new int[256];

         for(int i=0;i<m;i++){
            char ch = t.charAt(i);
            hash[ch]++;
         }

         while(r<n){
            char c = s.charAt(r);
            if(hash[c]>0){
                count++;
            }
            hash[c]--;

            while(count == m){
                if(r-l+1 < minlen){
                    minlen = r-l+1;
                    start = l;
                }
                char chr = s.charAt(l);
                hash[chr]++;
                if(hash[chr] > 0){
                    count--;
                }
                l++;
            }
            r++;
         }

        return start == -1 ? "" : s.substring(start, start + minlen);
    }
}