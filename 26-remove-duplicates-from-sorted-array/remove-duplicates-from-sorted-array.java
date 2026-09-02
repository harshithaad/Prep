class Solution {
    public int removeDuplicates(int[] nums) {
        int officer = 0;
        int len = nums.length;
        for(int cm = 1; cm<len; cm++){
            if(nums[cm] != nums[officer]){
                nums[++officer] = nums[cm];     

            }
        }
        return officer+1;
    }
}