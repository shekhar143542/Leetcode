class Solution {
    public int[] sortByReflection(int[] nums) {
         Integer[] arr = new Integer[nums.length];
         int idx = 0;
         for(int i=0;i<arr.length;i++){
            arr[i] = nums[i];

         }
         Arrays.sort(arr, (a,b) -> {
            int l = reverse(a);
            int m = reverse(b);

            if(l!=m){
                return l-m;
            }

            return a-b;
         });
        
         int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }

        return result;

    }

    public int reverse(int num){
        int val = 0;
        while(num>0){
            val = ((val<<1) | (num & 1));
            num >>=1;
        }
        return val;
    }
}