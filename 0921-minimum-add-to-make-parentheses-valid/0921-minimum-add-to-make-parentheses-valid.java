class Solution {
    public int minAddToMakeValid(String s) {
        int openBrackets = 0;
        int minAddsRequired = 0;

        for (char c : s.toCharArray()) {
            if (c == ')') {
                if (openBrackets > 0) openBrackets--;
                else minAddsRequired++;
            } else openBrackets++;
        }
        return minAddsRequired + openBrackets;
    }
}