class Solution {

    public int longestOnes(int[] nums, int k) {
        
        int low=0, high=0;
        int res=0;
        int n = nums.length;
        int countZeros = 0;

        for(high = 0; high<n; high ++){

            if(nums[high] == 0) countZeros++;

            while(countZeros > k){
                
                if(nums[low] == 0) countZeros--;
                low++;       
            }

            res = Math.max(res, high-low+1);  
        }

        return res;
    }
}