class Solution {
    public String mergeAlternately(final String word1, final String word2) {
        final StringBuilder result = new StringBuilder();
        int counter = 0;
        while (counter < word1.length() || counter < word2.length()) {
            if (counter < word1.length()) {
                result.append(word1.charAt(counter));
            }
            if (counter < word2.length()) {
                result.append(word2.charAt(counter));
            }
            counter++;
        }
        return result.toString();
    }
}