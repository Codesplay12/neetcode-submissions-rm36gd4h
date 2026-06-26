class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];
        int low = 0;
        int high = k-1;
        int idx = 0;

        while(high < n){
            int max = nums[low];
            for(int i = low; i <= high; i++){
                max = Math.max(max, nums[i]);
            }
            res[idx++] = max;
            low++;
            high++;
        }
        return res;
    }
}