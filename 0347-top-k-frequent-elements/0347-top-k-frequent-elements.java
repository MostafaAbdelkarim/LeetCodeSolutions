class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 1) return new int []{nums[0]};
        final Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        final ArrayList<Map.Entry<Integer, Integer>> myArrayList = new ArrayList<>(map.entrySet());
        myArrayList.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());
        final int[] rslt = new int[k];
        for (int i = 0; i < k; i++) {
            rslt[i] = myArrayList.get(i).getKey();
        }
        return rslt;
    }
}