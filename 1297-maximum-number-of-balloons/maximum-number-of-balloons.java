class Solution {
    public int maxNumberOfBalloons(String text) {
        int copies = Integer.MAX_VALUE;
        int n = text.length();
        String str = "balloon";
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i=0;i<str.length();i++){
            map1.put(str.charAt(i), map1.getOrDefault(str.charAt(i), 0)+1);
        }

        for(int j=0;j<n;j++){
             map2.put(text.charAt(j), map2.getOrDefault(text.charAt(j), 0)+1);
        }

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
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