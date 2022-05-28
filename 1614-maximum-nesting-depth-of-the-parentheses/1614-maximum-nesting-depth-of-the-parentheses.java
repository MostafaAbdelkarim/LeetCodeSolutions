class Solution {
    public int maxDepth(String s) {
        int maxVPS = 0;
        Stack<String> stack = new Stack<String>();
        for(char ch: s.toCharArray())
        {
            if(ch == '(')
            {
                stack.push("(");
                maxVPS = Math.max(maxVPS, stack.size());
            }
            else if(ch == ')')
            {
                stack.pop();
            }
        }
        return maxVPS;
    }
}