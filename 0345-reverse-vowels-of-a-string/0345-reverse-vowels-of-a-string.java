class Solution {
    public String reverseVowels(String s) {
        final char[] chars = s.toCharArray();
        final Stack<Character> stack = new Stack();
        
        for(int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) stack.push(chars[i]);
        }
        
        for(int i = 0; i < chars.length; i++) {
            if(isVowel(chars[i])) chars[i] = stack.pop();
        }

        return new String(chars);
    }
    
    private boolean isVowel(char s) {
        return s == 'a' || s == 'i' || s == 'e' || s == 'o' || s == 'u' || s == 'A' || s == 'I' || s == 'E' || s == 'O' || s == 'U';
    }
}