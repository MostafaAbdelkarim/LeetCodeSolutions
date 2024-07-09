class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        final List<List<Integer>> result = new ArrayList<>();
        final Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> group = new ArrayList<>();

            if (groupSizes[i] == 1) {
                group.add(i);
                result.add(group);
            } else {
                if (map.containsKey(groupSizes[i])) {
                    group = map.get(groupSizes[i]);
                    if (groupSizes[i] -1 > group.size()) {
                        group.add(i);
                    } else {
                        map.remove(groupSizes[i]);
                        group.add(i);
                        result.add(group);
                    }
                } else {
                    group.add(i);
                    map.put(groupSizes[i], group);
                }
            }
        }
        return result;
    }
}