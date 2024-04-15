class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        final List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<Integer>());
        for(int i = 0; i < nums.length; i++) {
            int n = result.size();
            for(int j = 0; j < n; j++) {
                List<Integer> temp = new ArrayList(result.get(j));
                temp.add(nums[i]);
                result.add(temp);
            }
        }
       return result; 
    }
}