class Solution {
    public void sortColors(int[] nums) {
        int curr;

        for(int i = 0; i < nums.length-1; i++){
            for(int j = 1; j < nums.length-i; j++){
                if(nums[j-1] > nums[j]){
                    curr = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = curr;
                }
            }
        }
    }
}