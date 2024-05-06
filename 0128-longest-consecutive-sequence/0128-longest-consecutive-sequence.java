class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        final Set<Integer> set = new HashSet<>();
        for (int i: nums) set.add(i);
        int counter = 0;        
        for (int i: set) {
            if (set.contains(i+1)) continue;
            int count = 0;
            while (set.contains(i - ++count));
            counter = Math.max(counter, count);
        }
        return counter;
    }
}