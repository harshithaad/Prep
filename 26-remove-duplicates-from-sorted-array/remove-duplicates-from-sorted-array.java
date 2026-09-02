class Solution {
    public int removeDuplicates(int[] nums) {
        int officer = 0;
        int unique = 1;
        int cm = 1;
        int len = nums.length;

        while(cm < len){
            if(nums[officer] == nums[cm]) cm++;
            else{
                ++officer;
                nums[officer] = nums[cm];
                unique++;  
                cm++;           

            }
        }
        return unique;
    }
}