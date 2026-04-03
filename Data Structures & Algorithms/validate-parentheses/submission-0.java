class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            // push opening brackets
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            // check closing brackets
            else{
                if(stack.isEmpty()) return false; // ✅ no opening bracket!

                char top = stack.pop();

                if(c == ')' && top != '(') return false; // ✅
                if(c == '}' && top != '{') return false; // ✅
                if(c == ']' && top != '[') return false; // ✅
            }
        }
        return stack.isEmpty(); // ✅ all brackets matched!
    }
}