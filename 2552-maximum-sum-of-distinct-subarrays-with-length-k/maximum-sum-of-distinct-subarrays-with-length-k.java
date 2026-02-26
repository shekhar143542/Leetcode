class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();
         long sum = 0;
         long max = 0;
         int n = nums.length;
         int s = 0;

         for(int e=0;e<n;e++){
            sum+=nums[e]; 
            map.put(nums[e], map.getOrDefault(nums[e], 0)+1);
            if(e-s+1>k){
                map.put(nums[s], map.get(nums[s])-1);
                if(map.get(nums[s]) == 0){
                    map.remove(nums[s]);
                }

                sum = sum-nums[s];
                s++;
            }

            if(e-s+1 == k && map.size() == k){
                max = Math.max(max, sum);
            }
         }
         return max;
    }
}