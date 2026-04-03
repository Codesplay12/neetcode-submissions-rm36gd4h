class Solution {

    public String encode(List<String> strs) {
       StringBuilder result = new StringBuilder();

       for(String word : strs){
        result.append(word.length());
        result.append("#");
        result.append(word);
       }

       return result.toString();
    }

   public List<String> decode(String s) {
    List<String> result = new ArrayList<>();
    int i = 0;

    while(i < s.length()){
        int j = s.indexOf('#', i);
        int length = Integer.parseInt(s.substring(i, j));
        String word = s.substring(j+1, j+1+length);
        result.add(word);
        i = j + 1 + length;
    }

    return result;
}
}
