class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int longCounter = 0;
        int shortCounter = 0;
        while(longCounter < t.length() && shortCounter < s.length()){
            if(t.charAt(longCounter) == s.charAt(shortCounter)) shortCounter++;
            longCounter++;
        }
        return shortCounter == s.length();
    }
}