class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxIndex = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
          
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != max) {
                if ((2*nums[i]) <= max) {
                    continue;
                } else {
                    return -1;
                }
            }
        }
        return maxIndex;
    }
}