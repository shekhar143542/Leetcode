class Solution {
    public List<String> generateParenthesis(int n) {
         List<String> list = new ArrayList<>();
        generateAll(list, "", 0, 0, 1,n);
        return list;
    }

    public void generateAll(List<String> li, String s, int open, int close, int idx, int n){
        if(open > n){
            return;
        }

        if(open+close == 2*n && open == close){
            li.add(s);
            return;
        }
        generateAll(li, s+'(', open+1, close, idx+1, n);
        if(open > close){
            generateAll(li, s+')', open, close+1, idx+1, n);
        }
    }
}