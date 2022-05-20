class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean monotoneInc = true;
        boolean monotoneDec = true;
        for(int i = 0; i < nums.length -1; ++i)
        {
            if(nums[i] > nums[i+1])
            {
                monotoneDec = false;
            }
            if(nums[i] < nums[i+1])
            {
                monotoneInc = false;
            }
        }
        return monotoneInc || monotoneDec;
    }
}