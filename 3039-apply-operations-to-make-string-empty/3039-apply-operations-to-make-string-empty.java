class Solution {
    public String lastNonEmptyString(String s) {
        int[] count = new int[26];
        int max = 0;
        for (char c: s.toCharArray()) {
            int num = ++count[c-'a'];
            max = Math.max(max, num);
        }

        final StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; --i) {
            char c = s.charAt(i);
            if (max == count[c-'a']) {
                sb.append(c);
                count[c-'a']--;
            }
        }
        return sb.reverse().toString();
    }
}