class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null) 
        {
            throw new IllegalArgumentException("Input array is null");
        }
        int len = nums.length;
        if (len == 0 || target <= nums[0]) 
        {
            return 0;
        }
        if (target == nums[len - 1]) 
        {
            return len - 1;
        }
        if (target > nums[len - 1]) 
        {
            return len;
        }
        int start = 1;
        int end = len - 1;
        while (start < end) 
        {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) 
            {
                return mid;
            }
            if (target < nums[mid]) 
            {
                end = mid;
            } 
            else 
            {
                start = mid + 1;
            }
        }
        return start;
    }
}

// binary search alt
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==target) 
        //     {
        //         return i;
        //     }
        //     if(nums[i]>target)
        //     {
        //         return i;
        //     }
        // }
        // return nums.length;