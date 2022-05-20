class Solution {
    public int countHillValley(int[] nums) {
        int res=0;
        int left=nums[0];
        for(int i=1;i<nums.length-1;i++)
        {
            int right = nums[i+1];
            int curr = nums[i];
            if((curr>left && curr>right)||(curr<left && curr<right))
            {
                res++;
                left=nums[i];
            }
        }
        return res;
    }
}