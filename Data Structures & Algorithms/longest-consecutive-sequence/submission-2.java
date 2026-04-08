class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        HashSet<Integer>set = new HashSet<>();
        int  maxcount = 0;

        for(int num : nums) set.add(num);


        for(int num: set)
       {
        if(!set.contains(num-1)){
            int  count = 1;
            
                while(set.contains(num+1)){
                    count++;
                    num++;
                }
                maxcount = Math.max(maxcount,count);
            }
       }
              return maxcount;
        }
      
        
    }

