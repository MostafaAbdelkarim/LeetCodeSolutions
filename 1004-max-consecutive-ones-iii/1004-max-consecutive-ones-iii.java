class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        while(left < nums.length){
            if(nums[left] == 0) k--;
            if(k < 0 && nums[right++] == 0) k++;
            left++;
        }
        return left-right;          
    }
}