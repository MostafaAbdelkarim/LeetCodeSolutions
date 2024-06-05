class Solution {
    public List<Integer> intersection(int[][] nums) {
        final Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                map.put(nums[i][j], map.getOrDefault(nums[i][j], 0)+1);
            }
        }
        final List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for (Integer i : map.keySet()) {
            if (map.get(i) >= n) {
                list.add(i);
            }
        }
        Collections.sort(list);
        return list;
        
    }
}