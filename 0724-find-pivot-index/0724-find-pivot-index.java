class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int current = 0;
        for(int x: nums) totalSum += x;
        for(int i = 0; i < nums.length; i++){
            if(current == totalSum-current-nums[i]) return i;
            current += nums[i];
        }
        return -1;
    }
}