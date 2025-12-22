class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            int key = arr[i];
            if(map.containsKey(key)){
                int freq = map.get(key);
                freq++;
                map.put(key, freq);
            }else{
                map.put(key,1);
            }
        }
        for(int num:map.values()){
            if(set.contains(num)){
                return false;
            }

            set.add(num);
        }

        return true;
    }
}