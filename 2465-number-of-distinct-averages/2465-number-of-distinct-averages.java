class Solution {
    public int distinctAverages(int[] nums) {
        final Set<Double> set = new HashSet<>();
        
        Arrays.sort(nums);

        int left = 0; 
        int right = nums.length - 1;

        while (left < right) {

            double avg = (nums[left] + nums[right]) / 2.0;
            set.add(avg);
            left++;
            right--;
        }
        return set.size();
    }
}