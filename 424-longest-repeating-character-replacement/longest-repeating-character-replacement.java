class Solution {
    public int characterReplacement(String s, int k) {
         int n = s.length();
         int[] hash = new int[26];
         int maxfreq = 0;
         int maxlen = 0;
         int l = 0;
         int r = 0;
         while(r<n){
            char ch = s.charAt(r);
             hash[ch-'A']++;
            maxfreq = Math.max(maxfreq, hash[ch-'A']);
            int changes = (r-l+1)-maxfreq;

            while(changes>k){
                hash[s.charAt(l)-'A']--;
                l++;
                changes = (r - l + 1) - maxfreq;
            }

            if(changes<=k){
                maxlen = Math.max(maxlen, r-l+1);
            }

            r++;
         }
         return maxlen;
    }
}