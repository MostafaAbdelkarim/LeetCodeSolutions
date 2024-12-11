class Solution {
    public int matrixSum(int[][] nums) {
        for (int[] row : nums) {
            Arrays.sort(row);
        }

        int result = 0;
        int n = nums.length;
        int m = nums[0].length;

        for (int col = m - 1; col >= 0; col--) {
            int maxInCol = 0;

            for (int row = 0; row < n; row++) {
                maxInCol = Math.max(maxInCol, nums[row][col]);
            }

            result += maxInCol;
        }

        return result;
    }
}
