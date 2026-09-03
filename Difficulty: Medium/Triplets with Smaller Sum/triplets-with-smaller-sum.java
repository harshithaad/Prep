class Solution {
    int countTriplets(int sum, int arr[]) {
        
        int count  = 0;
        int len = arr.length;
        int curr_sum = arr[0] + arr[1] + arr[2];
        
        Arrays.sort(arr);
        
        for(int i=0; i<len-2; i++){
            
            int left = i+1;
            int right = len-1;
            
            while(left<right){
                
                curr_sum = arr[i] + arr[left] + arr[right];
                
                if(curr_sum >= sum){
                    right--;
                }
                
                else{
                    count += right-left;
                    left++;
                }
                
            }
            
            
        }
        return count;
    
    }
}