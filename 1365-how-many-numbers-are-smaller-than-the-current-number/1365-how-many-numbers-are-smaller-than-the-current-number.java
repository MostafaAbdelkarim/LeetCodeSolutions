class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smaller = new int[nums.length];
        for(int i = 0; i < smaller.length; i++)
        {
            smaller[i] = nums[i];
        }
        Arrays.sort(smaller);
        HashMap<Integer, Integer> map = new HashMap();
        for(int i : nums)
        {
            map.put(i, -1);
        }
        for(int i = smaller.length-1; i >= 0; i--)
        {
            map.put(smaller[i], i);
        }
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
}