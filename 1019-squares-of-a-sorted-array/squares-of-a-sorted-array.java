class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int left=0, right=len-1, pos = len-1;
        int[] res = new int[len];
        

        while(left <= right){
            if(nums[left] * nums[left]> nums[right] * nums[right]){
                res[pos] = nums[left] * nums[left];
                pos--;
                left++;
            }
            else{
                res[pos] = nums[right] * nums[right];
                pos--;
                right--;
            }
        }
        return res;


        
        
    }
}