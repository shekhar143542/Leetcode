class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
           Arrays.sort(asteroids);
           long cur = mass;
           for(int num:asteroids){
               if(cur<num){
                return false;
               }
               cur+=num;
           }
           return true;
    }
}