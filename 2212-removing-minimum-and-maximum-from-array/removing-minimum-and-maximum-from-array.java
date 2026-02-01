class Solution {
    public int minimumDeletions(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minind = 0;
        int maxind = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min = nums[i];
                minind = i;
            }
             if (nums[i] > max) {
                max = nums[i];
                maxind = i;
            }
        }

       int left = Math.min(minind, maxind);
       int right = Math.max(minind, maxind);

       int case1 = right+1;
       int case2 = n-left;

       int case3 = (left+1)+(n-right);

       return Math.min(case1, Math.min(case2, case3));
    }
}