class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int k = 1;
        while(i < j && j < nums.length){
            if(nums[i] == nums[j])
            {    j++;
                
            }
            else if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
                j++;
                k++;
            }
        }
        return k;
    }
}