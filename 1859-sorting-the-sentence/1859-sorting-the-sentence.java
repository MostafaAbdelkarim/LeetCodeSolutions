class Solution {
    public String sortSentence(String s) {
        final String[] words = s.split(" ");
        final String[] sortedWords = new String[words.length];
    
        for (String word : words) {
            int position = word.charAt(word.length() - 1) - '0';
            sortedWords[position - 1] = word.substring(0, word.length() - 1);
        }
        
        return String.join(" ", sortedWords);
    }
}