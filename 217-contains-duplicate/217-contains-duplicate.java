class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean evaluated = false;
        if(nums == null || nums.length == 1)
        {
            evaluated = false;
        }
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] == nums[i-1])
            {
                evaluated = true;
            }
        }
        return evaluated;
    }
}

// HashSet Solution --> T = O(N)
//                  --> S = O(N)
// HashSet<Integer> found = new HashSet<>();
//         for (int n : nums) {
//             if (!found.add(n)) {
//                 return true;
//             }
//         }