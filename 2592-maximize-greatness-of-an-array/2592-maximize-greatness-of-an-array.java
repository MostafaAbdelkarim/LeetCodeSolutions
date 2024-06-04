class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i : nums) {
            if (i > nums[count]) 
                count++;
        }
        return count;
    }
}