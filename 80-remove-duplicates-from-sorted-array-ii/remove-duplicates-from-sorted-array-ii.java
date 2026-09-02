class Solution {
    public int removeDuplicates(int[] nums) {

        int officer = 1;
        int len = nums.length;

        for(int cm = 2; cm<len; cm++){
            if(nums[cm] != nums[officer - 1]){
                nums[++officer] = nums[cm];
            }
        }

        return officer+1;
    }
}