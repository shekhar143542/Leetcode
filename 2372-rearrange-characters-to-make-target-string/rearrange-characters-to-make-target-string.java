class Solution {
    public int rearrangeCharacters(String s, String target) {
        int copies = Integer.MAX_VALUE;
        int n = s.length();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i=0;i<target.length();i++){
            map1.put(target.charAt(i), map1.getOrDefault(target.charAt(i), 0)+1);
        }

        for(int j=0;j<n;j++){
             map2.put(s.charAt(j), map2.getOrDefault(s.charAt(j), 0)+1);
        }

        for(int i=0;i<target.length();i++){
            char c = target.charAt(i);
            int x = 0;
            int y = 0;
            if(map2.containsKey(c)){

             x = map1.get(c);
             y = map2.get(c);
            }else{
                return 0;
            }
            copies = Math.min(copies, y/x);
        }
        return copies;
    }
}