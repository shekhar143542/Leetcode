class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int n = chars.length;
        int i = 0;
        
        while(i<n){
            char current = chars[i];
            int count = 0;
            while(i<n && chars[i] == current){
                count++;
                i++;
            }
            chars[index++] = current;

            if(count>1){

            for(char ch: String.valueOf(count).toCharArray()){
                chars[index++] = ch;
            }
        }
    }
    return index;
    }
}