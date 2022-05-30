class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) return false;
        Set<Character> alphabet = new HashSet<Character>();
        for(char ch: sentence.toCharArray())
        {
            alphabet.add(ch);
        }
        if(alphabet.size() < 26)
        {
            return false;
        }
        return true;
    }
}