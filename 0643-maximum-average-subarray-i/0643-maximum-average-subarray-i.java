class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int totalSum = 0;
        for(int i = 0; i < k; i++){
            totalSum += nums[i];
        }
        int maxSum = totalSum;
        
        int startIndex = 0;
        int endIndex = k;
        while(endIndex < nums.length){
            totalSum -= nums[startIndex];
            startIndex++;
            
            totalSum += nums[endIndex];
            endIndex++;
            maxSum = Math.max(totalSum, maxSum);
        }
        return (double) maxSum/k;
    }
}