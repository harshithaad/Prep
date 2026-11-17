class Solution {
    public void nextPermutation(int[] nums) {

        int pivot = -1;
        int n = nums.length;

        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }
        
        if(pivot !=-1){
            for(int i=n-1; i>pivot; i--){
                if(nums[i] > nums[pivot]){
                    swap(nums, i, pivot);
                    break;
                }
            }
        }


        int left = pivot + 1;
        int right = n-1;

        while(left<right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}