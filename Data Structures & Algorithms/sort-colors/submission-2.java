class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int curr;

        for(int i = 0; i < n-1; i++){        // ✅ outer loop added
            for(int j = 1; j < n-i; j++){     // ✅ inner loop added
                if(nums[j-1] > nums[j]){
                    curr = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = curr;
                }
            }
        }
    }
}