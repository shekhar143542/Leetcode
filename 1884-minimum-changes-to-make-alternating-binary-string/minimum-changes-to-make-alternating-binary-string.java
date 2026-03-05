class Solution {
    public int minOperations(String s) {
        int n = s.length();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        int count1 = 0;
        int count2 = 0;

        for(int i=0;i<n;i++){
            if(i%2 == 0){
                sb1.append(0);
                sb2.append(1);
            }else{
                sb1.append(1);
                sb2.append(0);
            }

            if(sb1.charAt(i) != s.charAt(i)){
                count1++;
            }else{
                count2++;
            }
        }

        return Math.min(count1,count2);
    }
}