class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            max = Math.max(max, i-left+1);
        }

        return max;
    }
}