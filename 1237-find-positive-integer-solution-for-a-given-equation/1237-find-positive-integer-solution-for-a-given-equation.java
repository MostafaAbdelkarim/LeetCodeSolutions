/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        final List<List<Integer>> results = new ArrayList<>();
    
        for (int i = 1; i <= 1000; i++) {
            if (customfunction.f(i, 1) > z) {
                break;
            }

            int left = 1;
            int right = 1000;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                int r = customfunction.f(i, mid);
                if (r > z) {
                    right = mid - 1;
                } else if (r < z) {
                    left = mid + 1;
                } else {
                    results.add(Arrays.asList(i, mid));
                    break;
                }
            }
        }
        return results;
    }
}