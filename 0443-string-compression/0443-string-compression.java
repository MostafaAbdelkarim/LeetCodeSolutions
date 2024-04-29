class Solution {
    public int compress(char[] chars) {
        final StringBuilder sb = new StringBuilder("");
        int len1 = chars.length;
        int i;
        int count = 1;
        for (i = 0; i < len1; i++) {
            count = 1;
            sb.append(chars[i]);
            while (i + 1 < len1 && (chars[i] == chars[i+1])) {
                count++;
                i++;
            }
            if (count > 1)
            sb.append(count);
        }
        for (i = 0; i < sb.length(); i++) chars[i] = sb.charAt(i);
        return sb.length();
    }
}