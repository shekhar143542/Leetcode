class Solution {
    public List<Integer> findAnagrams(String s, String p) {
         int n = p.length();
        int start = 0;
        List<Integer> list = new ArrayList<>();
         if (s.length() < p.length()) {
            return list;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = p.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0)+1);
        }
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0)+1);
        }
        if(checkanagram(map1, map2)){
            list.add(start);
        }
        for(int e=n;e<s.length();e++){
            char c1 = s.charAt(e);
            char c2 = s.charAt(start);
            map2.put(c2, map2.get(c2)-1);
            if(map2.get(c2) == 0){
                map2.remove(c2);
            }
            map2.put(c1, map2.getOrDefault(c1, 0)+1);
            start++;
            if(checkanagram(map1, map2)){
                list.add(start);
            }
        }
        return list;
    }

    public boolean checkanagram(HashMap<Character, Integer> m1, HashMap<Character, Integer> m2){
         int n = m1.size();
         int m = m2.size();

        if(n!=m){
            return false;
        }
        for(Character ch:m2.keySet()){
             if(!m1.containsKey(ch) || !m2.get(ch).equals(m1.get(ch))){
                 return false;
             }
        }
            return true;
    }
}