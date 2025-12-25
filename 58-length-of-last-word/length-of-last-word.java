class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.trim().split("\\s+");
        Stack<String> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }

        return st.pop().length();
    }
}