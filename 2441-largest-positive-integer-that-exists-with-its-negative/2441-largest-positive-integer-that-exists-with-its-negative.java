class Solution {
    public int findMaxK(int[] nums) {
        final Set<Integer> intSet = new HashSet();
        int max = -1;
        for(int i = 0; i < nums.length; ++i){
            intSet.add(nums[i]);
            if (intSet.contains(nums[i]*-1)) {
                max = Math.max(max , Math.max(nums[i],nums[i]*-1));
            }
        }
        return max;
    }
}