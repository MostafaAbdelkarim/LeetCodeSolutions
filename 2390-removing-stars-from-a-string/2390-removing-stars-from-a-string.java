class Solution {
    public String removeStars(String s) {
        final Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*') {
                stack.pop();
            } 
            else {
                stack.push(s.charAt(i));
            }
        }
        final StringBuilder result = new StringBuilder("");
        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}