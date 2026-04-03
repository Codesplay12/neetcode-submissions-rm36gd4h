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

 // empty list to store decoded words
// ["hello","world"] will go here
    List<String> result = new ArrayList<>();


    // i is our pointer
// starts at beginning of string
// "5#hello5#world"
//  ↑
//  i=0
    int i = 0;



    // keep going until i reaches end
// "5#hello5#world"  length=14
// stops when i=14

    while(i < s.length()){


        // indexOf('#', i) finds FIRST # starting from i
// "5#hello5#world"
//   ↑
//   j=1  (first # from i=0)
        int j = s.indexOf('#', i);

        // substring(i,j) extracts characters from i to j
// substring(0,1) = "5"
// Integer.parseInt("5") = 5  converts String to int
        int length = Integer.parseInt(s.substring(i, j));


        // j+1     = skip the # character
// j+1+length = read exactly 'length' characters
// substring(2, 7) = "hello" ✅

        String word = s.substring(j+1, j+1+length);


        // add "hello" to result list
// result = ["hello"]
        result.add(word);


        // j=1, length=5
// i = 1+1+5 = 7
// move to next word's starting position
// "5#hello5#world"
//         ↑
//         i=7

        i = j + 1 + length;
    }

    return result;
}
}
