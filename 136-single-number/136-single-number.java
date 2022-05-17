class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        if(nums.length == 1)
        {
            return nums[0];
        }
        if(nums.length < 1)
        {
            return 0;
        }
        for(int i = 0; i < nums.length; i++)
        {
            //XOR operator for "linear runtime complexity/constant extra space"
            result = result ^ nums[i]; 
        }
        return result;
    }
}