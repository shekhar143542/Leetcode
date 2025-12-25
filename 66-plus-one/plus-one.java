class Solution {
    public int[] plusOne(int[] digits) {
         int n = digits.length-1;
         int carry = 0;
         digits[n] = digits[n]+1;
         for(int i=n;i>=0;i--){
            digits[i] = digits[i]+carry;
            if(digits[i] < 10){
                carry = 0;
                break;
            }else if(digits[i] == 10){
                digits[i] = 0;
                carry = 1;
            }

         }
         if(carry == 1){
            int[] arr = new int[n+2];
            arr[0] = 1;
            return arr;
         }

         return digits;
    }
}