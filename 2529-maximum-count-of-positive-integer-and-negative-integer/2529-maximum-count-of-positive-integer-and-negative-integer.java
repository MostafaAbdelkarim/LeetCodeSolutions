class Solution {
    public int maximumCount(int[] nums) {
        int positiveCounter = 0;
        int negativeCounter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positiveCounter++;
            } else if (nums[i] < 0) {
                negativeCounter++;
            } else {
                continue;
            }
        }
        return Math.max(positiveCounter, negativeCounter);
    }
}