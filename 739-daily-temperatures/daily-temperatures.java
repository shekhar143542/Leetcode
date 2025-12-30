class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] arr = new int[n];
        Stack<Pair> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek().x<=temperatures[i]){
                st.pop();
            }

            if(st.isEmpty()){
                arr[i] = 0;
            }else{
                arr[i] = st.peek().y-i;
            }

            st.push(new Pair(temperatures[i],i));
        }

        return arr;
    }
}
class Pair{
    int x;
    int y;
    Pair(int x,  int y){
        this.x = x;
        this.y = y;
    }
}