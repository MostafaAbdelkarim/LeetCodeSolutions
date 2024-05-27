class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        final int[][] ans = new int[intervals.length][intervals[0].length];
        int counter = 0;
        for (int i = 0; i < intervals.length; i++) {
            boolean isCovered = false;
            for (int j = 0; j < intervals.length; j++) {
                if (i != j && isCovered(intervals[i], intervals[j])) {
                    isCovered = true;
                    break;
                }
            }
            if (!isCovered) {
                ans[counter++] = intervals[i];
            }
        }
        return counter;
    }
    
    private boolean isCovered(int[] a, int[] b) {
        return b[0] <= a[0] && a[1] <= b[1];
    }
    
}