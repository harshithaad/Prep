class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        
        int len = arr.length;
        
        
        int low  = 0;
        int high = k;
        
        int sum = 0;
        int res = 0;
        
        for(int i=0; i<high; i++){
            sum += arr[i];
            res = sum;
        } 
        
        while(high<len){
            sum = sum - arr[low] + arr[high];
            res = Math.max(res, sum);
            low++;
            high++;
        }
        return res;
    }
}