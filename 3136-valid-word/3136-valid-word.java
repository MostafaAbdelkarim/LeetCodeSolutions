class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }
        final Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        boolean vowel = false, consonant = false;
        for (char ch : word.toCharArray()) {
            if (vowels.contains(ch)) {
                vowel = true;
            } else if (Character.isLetter(ch)) {
                consonant = true;
            } else if (Character.isDigit(ch)) {
                continue;
            } else {
                return false;
            }
        }

        return vowel && consonant;
    }  
}