class Solution {
    public int maxArea(int[] height) {
          int s = 0;
          int e = height.length-1;
          int area = Integer.MIN_VALUE;
          int len = 0;

          while(s<e){
            len = Math.min(height[s], height[e]);
            area = Math.max(area, len*(e-s));
            if(height[s]<height[e]){
                s++;
            }else{
                e--;
            }
          }
          return area;
    }
}