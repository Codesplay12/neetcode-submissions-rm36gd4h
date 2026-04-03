class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;
     
      char[] s1 = t.toCharArray();
      char[] s2 = s.toCharArray();

      Arrays.sort(s2);

      Arrays.sort(s1);

      return Arrays.equals(s1,s2);

      
    }
}
