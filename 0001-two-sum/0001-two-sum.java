class Solution {
    public int[] twoSum(int[] nums, int target) {
        final Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int computed = target - nums[i];
            if (result.containsKey(computed)) {
                return new int[] {result.get(computed), i};
            }
            result.put(nums[i], i);
        }
        return null;
    }
}