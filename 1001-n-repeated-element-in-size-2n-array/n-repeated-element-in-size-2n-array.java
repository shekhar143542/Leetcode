class Solution {
    public int repeatedNTimes(int[] nums) {
     HashMap<Integer, Integer> map = new HashMap<>();
     int n = nums.length;
     for(int i=0;i<n;i++){
        if(map.containsKey(nums[i])){
            return nums[i];
        }else{
            map.put(nums[i], 1);
        }
     }
     return -1;
    }
}