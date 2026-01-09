class Solution {
    public int[] asteroidCollision(int[] asteroids) {
         Stack<Integer> st = new Stack<>();
         st.push(asteroids[0]);
         int n = asteroids.length;
         if(n == 1){
            return asteroids;
         }
         for(int i=1;i<n;i++){
            boolean flag = false;
            int x = asteroids[i];
            while(!st.isEmpty() && st.peek()>0 && x<0){
                if(Math.abs(st.peek()) < Math.abs(x)){
                    st.pop();
                    continue;
                }else if(Math.abs(st.peek()) == Math.abs(x)){
                    flag = true;
                    st.pop();
                    break;
                }else{
                    flag =true;
                    break;
                }
            }
            if(!flag){
                st.push(x);
            }
         }

         int[] ans = new int[st.size()];
         for(int i=st.size()-1;i>=0;i--){
            ans[i] = st.pop();
         }

         return ans;
    }
}