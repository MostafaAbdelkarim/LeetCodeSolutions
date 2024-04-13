class Solution {
    public int[] productExceptSelf(int[] nums) {
        int current = 1; 
        final int[] result = new int [nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = current;
            current *= nums[i];
        }
        current = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * current;
            current *= nums[i];
        }
        return result;
    }
}