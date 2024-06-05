class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        final Map<Integer, Integer> map = new HashMap<>();
        final List<Integer> list = new ArrayList<>();

        for (int i : nums1) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
                continue;
            }
            map.put(i, 1);
        }

        for (int i : nums2) {
            if (map.containsKey(i) && map.get(i) > 0) {
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        final int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }      
        return arr;
    }
}