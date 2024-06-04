class Solution {
    public int longestPalindrome(String s) {
        int result = 0;
        boolean odd = false;
        final Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (int value : map.values()) {
            if ((value % 2 == 0)) {
                result += value;
            } else {
                result += value - 1;
                odd = true;
            }
        }
        return odd ? result + 1 : result;
    }
}