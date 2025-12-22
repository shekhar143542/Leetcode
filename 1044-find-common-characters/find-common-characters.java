class Solution {
    public List<String> commonChars(String[] words) {
        int[] commonfreq = new int[26];
        Arrays.fill(commonfreq, Integer.MAX_VALUE);
        List<String> list = new ArrayList<>();
        for(String word: words){
            String val = word;
            int[] currentfreq = new int[26];
            for(int i=0;i<val.length();i++){
                currentfreq[val.charAt(i)-'a']++;
            }

            for(int i=0;i<26;i++){
                commonfreq[i] = Math.min(commonfreq[i], currentfreq[i]);
            }
        }

        for(int j=0;j<26;j++){
            int freq = commonfreq[j];
            while(freq>0){
                list.add(Character.toString(j+'a'));
                freq--;
            }
        }
        return list;
    }
}