class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // put array in the map
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num,map.getOrDefault(num,0) + 1);
            }
            else{
                map.put(num,1);
            }
        }

        // get all the frequency of keys in list
         List<Integer> list = new ArrayList<>();
            for(int num : map.keySet()){
            list.add(num);

            }

            // it compare frequency with each other sort in descending order
         Collections.sort(list, (a,b) -> map.get(b) - map.get(a));


           // by the help of frequency we sort array and put them in array
         int[] res = new int[k];

         for(int i = 0;i<k;i++){
            res[i] = list.get(i);
         }

         return res;
    }
}
        

          







