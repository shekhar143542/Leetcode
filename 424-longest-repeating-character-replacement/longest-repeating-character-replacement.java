class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] freq = new int[26];

        int start = 0;
        int maxf = 0;
        int maxlen = 0;

        for (int end = 0; end < n; end++) {
            char ch = s.charAt(end);
            freq[ch - 'A']++;

            maxf = Math.max(maxf, freq[ch - 'A']);

            int windowSize = end - start + 1;
            if (windowSize - maxf > k) {
                freq[s.charAt(start) - 'A']--;
                start++;
            }

            maxlen = Math.max(maxlen, end - start + 1);
        }

        return maxlen;
    }
}
