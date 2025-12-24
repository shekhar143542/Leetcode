class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        generatesubsets(nums, list, ans, 0, nums.length);
       
        return ans;
    }

    public void generatesubsets(int[] arr, List<Integer> li, List<List<Integer>> ans, int inx, int n){

        if(inx == n){
            ans.add(new ArrayList<>(li));
            return;
        }

        li.add(arr[inx]);
        generatesubsets(arr, li, ans, inx+1, n);
         li.remove(li.size()-1);

         generatesubsets(arr, li, ans, inx+1, n);


    }
}