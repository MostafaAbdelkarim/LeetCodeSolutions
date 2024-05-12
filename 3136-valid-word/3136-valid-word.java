class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;
        
        final char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        boolean vowel = false;
        boolean cons = false;
        word = word.toLowerCase();
        
        for (char ch : word.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (Arrays.binarySearch(vowels, ch) >= 0) {
                    vowel = true;
                } else {
                    cons = true;
                }
            } else if (Character.isDigit(ch)) {
                continue;
            } else {
                return false;
            }
        }
        return vowel && cons;
    }
    
}