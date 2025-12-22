class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0;
        int count = 0;
        int r = nums.length-1;
        while(l<r){
            int val = nums[l]+nums[r];
            if( val == k){
                count++;
            l++;
            r--;
            }else if(val > k){
                r--;
            }else{
                l++;
            }
        }
        return count;
    }
}