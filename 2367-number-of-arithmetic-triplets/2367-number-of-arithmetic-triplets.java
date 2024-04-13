class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n = nums.length;
        int first = 0;
        int second = 1;
        int third = 2;
        int counter = 0;
        while (first < n && second < n && third < n) {
            if (nums[second] - nums[first] < diff) {
                second++;
            } else if (nums[second] - nums[first] > diff) {
                first++;
            } else {
                if (nums[third] - nums[second] < diff) {
                    third++;
                } else if (nums[third] - nums[second] > diff) {
                    second++;
                } else {
                    counter++;
                    third++;
                }
            }
        }
        return counter;
    }
}