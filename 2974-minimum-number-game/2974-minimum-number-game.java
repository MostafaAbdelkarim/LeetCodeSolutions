class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int first = 0;
        int second = 1;
        while (second < nums.length) {
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
            first = second + 1;
            second = first + 1;
        }
        return nums;
    }
}