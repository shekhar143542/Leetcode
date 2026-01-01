class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int k = 2;
        HashMap<Integer, Integer> map = new HashMap<>();

        int start = 0;
        for(int e=0;e<n;e++){
            map.put(fruits[e], map.getOrDefault(fruits[e], 0)+1);
            while(map.size()>2){
                map.put(fruits[start], map.get(fruits[start])-1);
                if(map.get(fruits[start]) == 0){
                    map.remove(fruits[start]);
                }
                start++;
            }
            max = Math.max(max, e-start+1);
        }

        return max;
    }
}