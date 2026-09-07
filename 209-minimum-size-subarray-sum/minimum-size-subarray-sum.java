class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int len = nums.length;
        int low=0;
        int high=0;
        int sum = 0;
        int res = Integer.MAX_VALUE;

        


        while(high<len){
            sum = sum + nums[high];

            while(sum>=target){
                res = Math.min(res, high - low + 1);
                sum = sum - nums[low];
                low++;
            }
            high++;         
        }  

        if(res == Integer.MAX_VALUE) return 0; 
        else return res;    
    }

}