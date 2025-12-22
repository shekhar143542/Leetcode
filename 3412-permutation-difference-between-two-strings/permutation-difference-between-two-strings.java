class Solution {
    public int findPermutationDifference(String s, String t) {
          int n = s.length();
          int sum = 0;
          HashMap<Character, Integer> map1 = new HashMap<>();
          HashMap<Character, Integer> map2 = new HashMap<>();
        
        for(int i=0;i<n;i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            map1.put(c1,i);
            map2.put(c2,i);
        }
        for(int j=0;j<n;j++){
            char str = s.charAt(j);
            int v1 = map1.get(str);
            int v2 = map2.get(str);
            sum+=Math.abs(v1-v2);
        }
        return sum;
    }
}