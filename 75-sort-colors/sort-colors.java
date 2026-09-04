class Solution {

    public void swap(int[] nums, int v1, int v2){
        int temp = nums[v1];
        nums[v1] = nums[v2];
        nums[v2] = temp;

    }

    public void sortColors(int[] nums) {

        int len = nums.length;
        int idx = 0;
        int end = len-1;
        int start = 0;

        while(idx<=end){

            if(nums[idx] == 0){
                swap(nums, idx, start);
                start++;
                idx++;
            }

            else if (nums[idx] == 2){
                swap(nums, idx, end);
                end--;
            }
            else{
                idx++;
            }
        }
        
    }
}