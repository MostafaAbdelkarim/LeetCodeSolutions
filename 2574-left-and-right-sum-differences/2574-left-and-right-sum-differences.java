class Solution {
    public int[] leftRightDifference(int[] nums) {
        final int lsum[] = new int[nums.length];
        final int rsum[] = new int[nums.length];

        lsum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            lsum[i] = lsum[i - 1] + nums[i];
        }
        
        rsum[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            rsum[i] = rsum[i + 1] + nums[i];
        }

        for(int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(lsum[i] - rsum[i]);
        }

        return nums;
    }
}