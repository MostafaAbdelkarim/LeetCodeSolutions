class Solution {
    // using DP approach (Recursion + Memoization)
    private final Map<Integer, Integer> resultMap = new HashMap<>();
    public int fib(int n) {
        if (n <= 1) return n;
        if (resultMap.containsKey(n)) {
            return resultMap.get(n);
        } else {
            resultMap.put(n, fib(n-1) + fib(n-2));
        }
        return resultMap.get(n);
    }
}