class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        final HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            int currentCount = result.getOrDefault(arr[i], 0);
            result.put(arr[i], currentCount + 1);
        }
        
        final HashSet<Integer> uniqueCounts = new HashSet<>();
        for (int value : result.values()) {
            if (!uniqueCounts.add(value)) {
                return false;
            }
        }
        return true;
    }
}