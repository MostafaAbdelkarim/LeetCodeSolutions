class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        
        int left = 0;
        final String stringVal = String.valueOf(x);
        int right = stringVal.length() - 1;
        for (int i = 0; i < stringVal.length(); i++) {
            if (stringVal.charAt(left) != stringVal.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}