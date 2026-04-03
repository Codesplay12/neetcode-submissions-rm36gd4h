class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        Arrays.sort(people);
        int i = 0;
        int j = n-1;
        int boats = 0;

        while(i <= j){
            if(people[i] + people[j] <= limit){
                i++; // ✅ both fit
                j--;
            } else {
                j--; // ✅ heaviest goes alone
            }
            boats++; // ✅ always one boat used
        }
        return boats;
    }
}