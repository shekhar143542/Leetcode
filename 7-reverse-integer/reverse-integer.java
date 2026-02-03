class Solution {
    public int reverse(int x) {
        int sum=0;
        int rem;
        
        while(x!=0){

        rem = x%10;
       if (Math.abs(sum) > 214748364) {
    return 0;
}

        sum = sum*10+rem;
        x=x/10;

        }
       
        return sum;
    }
}