class Solution {
    public int minFlipsMonoIncr(String s) {
        int flipCount = 0;
        int countOnes = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                countOnes++;
            } else {
                flipCount = Math.min(flipCount + 1, countOnes);
            }
        }
        return flipCount;
    }
}