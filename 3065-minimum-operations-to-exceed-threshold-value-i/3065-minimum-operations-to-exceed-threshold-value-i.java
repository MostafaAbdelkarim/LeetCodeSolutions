class Solution {
    public int minOperations(int[] nums, int k) {
        int numOfOperations = 0;
        for (int num : nums) {
            if (num < k) {
                numOfOperations++;
            }
        }
        return numOfOperations;
    }
}