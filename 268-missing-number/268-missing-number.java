class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] != i) 
            {
                return i;
            }
        }
    return nums.length;
    }
}

// getting sum of all numbers and subtracting total to get missing element
// int n = nums.length;
//         int total = n * (n + 1) / 2;
//         int sum = 0;
//         for(int num : nums) {
//             sum += num;
//         }
//         return total - sum;
//     }