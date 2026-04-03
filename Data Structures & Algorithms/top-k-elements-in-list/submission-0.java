class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num,map.getOrDefault(num,0) + 1);
            }
            else{
                map.put(num,1);
            }
        }
         List<Integer> list = new ArrayList<>();
            for(int num : map.keySet()){
            list.add(num);

            }
         Collections.sort(list, (a,b) -> map.get(b) - map.get(a));

         int[] res = new int[k];

         for(int i = 0;i<k;i++){
            res[i] = list.get(i);
         }

         return res;
    }
}
        

          







