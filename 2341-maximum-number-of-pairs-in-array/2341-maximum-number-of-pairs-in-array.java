class Solution {
    public int[] numberOfPairs(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int counter = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i+1]) {
                counter += 1;
                i += 1;
            }
        }
        return new int[] {counter, n - 2 * counter};   
    }
}