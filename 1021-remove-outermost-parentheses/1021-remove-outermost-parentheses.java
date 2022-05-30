class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        String result = "";
        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            if (stack.isEmpty() && c == '(') 
            {
                stack.push(c);
                continue;
            }
            if (stack.size() == 1 && c == ')') 
            {
                stack.pop();
                continue;
            }
            if (c == '(') 
            {
                stack.push(c);
            }
            if (c == ')') 
            {
                stack.pop();
            }
            result = result + c + "";
        }
        return result;
    }
}