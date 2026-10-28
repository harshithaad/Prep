class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxEnding = 0;
        int minEnding = 0;
        int ans = 0;
        int maxSum = 0;
        int minSum = 0;
        
        for(int i =0; i<nums.length; i++){
            
            maxEnding = Math.max(maxEnding+nums[i], nums[i]);
            minEnding = Math.min(minEnding+nums[i], nums[i]);

            maxSum = Math.max(maxSum, maxEnding);
            minSum = Math.min(minSum, minEnding);

            ans = Math.max(Math.abs(maxSum), Math.abs(minSum));

        }
        return ans;
        
    }
}