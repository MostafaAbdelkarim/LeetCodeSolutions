class Solution {
    public int[] findErrorNums(int[] nums) {
        final Set<Integer> set = new HashSet<>();
		int [] arr = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) arr[0] = nums[i];
			set.add(nums[i]);
		}
		for (int i = 0; i < nums.length; i++) 
            if(!set.contains(i+1)) arr[1] = i+1;
		return arr;
    }
}