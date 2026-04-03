class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        int n = strs.length;

        StringBuilder result = new StringBuilder();
         
         char[] a = strs[0].toCharArray();
         char[] b = strs[n-1].toCharArray();

         for(int i = 0;i<a.length;i++){
            if(a[i] != b[i])
              break;

              result.append(a[i]);
         }

         return result.toString();
    }
}