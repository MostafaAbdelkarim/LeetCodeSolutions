class Solution {
    // using DP Buttom-up approach
    public int fib(int n) {
        if (n <= 1) return n;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i - 2];
        }
        return dp[n];
    }
}

// using DP approach
// private final Map<Integer, Integer> resultMap = new HashMap<>();
//     public int fib(int n) {
//         if (n <= 1) return n;
//         if (resultMap.containsKey(n)) {
//             return resultMap.get(n);
//         } else {
//             resultMap.put(n, fib(n-1) + fib(n-2));
//         }
//         return resultMap.get(n);
//     }