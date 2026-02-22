class NumArray {
    int[] seg;
    int stroot;
    int stl;
    int str;
    public NumArray(int[] nums) {
        seg = new int[4*nums.length];
        stroot = 0;
        stl = 0;
        str = nums.length-1;
        build(nums);
    }
    
    public void update(int index, int val) {
        pointreplace(index, val, stroot, stl, str);
    }

    public void pointreplace(int idx, int val, int stroot, int l, int r){
        
        if(idx<l || idx>r) return;

        if(l == r){
            seg[stroot] = val;
            return;
        }
        int mid = l+(r-l)/2;

        pointreplace(idx, val, 2*stroot+1, l, mid);
        pointreplace(idx, val, 2*stroot+2, mid+1, r);

        seg[stroot] = seg[2*stroot+1]+seg[2*stroot+2];
    }
    
    public int sumRange(int left, int right) {
         return sumquery(left, right, stroot, stl, str);
    }

    public int sumquery(int left, int right, int stroot, int stl, int str){

        if(right<stl || left>str) return 0;

        if(left <= stl && str <= right) return seg[stroot];
        
        int mid = stl+(str-stl)/2;

       int leftSum = sumquery(left, right, 2 * stroot + 1, stl, mid);
       int rightSum = sumquery(left, right, 2 * stroot + 2, mid + 1, str);

        return leftSum + rightSum;
    }

    public void build(int[] arr){
        for(int i=0;i<arr.length;i++){
            update(i, arr[i]);
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */