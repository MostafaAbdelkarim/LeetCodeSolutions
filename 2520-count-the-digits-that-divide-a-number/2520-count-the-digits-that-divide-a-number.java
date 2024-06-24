class Solution {
    public int countDigits(int num) {
        int count = 0;
        final String stringVal = String.valueOf(num);
        for (char c : stringVal.toCharArray()) {
            int a = c - '0';
            if (num % a == 0) {
                count++;
            }
        }
        return count;
    }
}