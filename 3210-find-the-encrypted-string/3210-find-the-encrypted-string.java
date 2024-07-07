class Solution {
    public String getEncryptedString(String s, int k) {
        final StringBuilder ans = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            ans.append(s.charAt((i+k)%n));
        }
        return ans.toString();
    }
}