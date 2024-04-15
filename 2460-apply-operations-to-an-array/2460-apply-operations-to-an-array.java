class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; ++i) {
            if (nums[i - 1] == nums[i]) {
                nums[i - 1] = nums[i - 1] * 2;
                nums[i] = 0;
            }
        }
        for (int i = 0, left = 0; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[left]=temp;
                left++;
            }
        }
        return nums;
    }
}