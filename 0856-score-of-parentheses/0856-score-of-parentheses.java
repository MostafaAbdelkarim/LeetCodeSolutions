class Solution {
    public int scoreOfParentheses(String s) {
        final Stack<Integer> st = new Stack<>();
        int score = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(score);
                score = 0;
            } else {
                score = Math.max(1, score * 2);
                score += st.pop();
            }
        }
        return score;
    }
}