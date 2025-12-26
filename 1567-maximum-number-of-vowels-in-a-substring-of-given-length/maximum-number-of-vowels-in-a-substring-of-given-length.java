class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int max = 0;
        int count = 0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            max = Math.max(count, max);
        }
        int start = 0;
        for(int e=k;e<n;e++){
            if(isVowel(s.charAt(start))){
                count--;
            }
            if(isVowel(s.charAt(e))){
                count++;
            }
            max = Math.max(max, count);
            start++;
        }
        return max;
    }

    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
            return true;
        }
        return false;
    }
}