class Solution {
    
    // Initial solution
//     int flipCount = 0;
//         int countOnes = 0;

//         for (char c : s.toCharArray()) {
//             if (c == '1') {
//                 countOnes++;
//             } else {
//                 flipCount = Math.min(flipCount + 1, countOnes);
//             }
//         }
//         return flipCount;
    
    public int minFlipsMonoIncr(String s) {
        int n = s.length();
        final int[] prefixOnes = new int[n + 1];
        final int[] suffixZeros = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefixOnes[i + 1] = prefixOnes[i] + (s.charAt(i) == '1' ? 1 : 0);
        }

        for (int i = n - 1; i >= 0; i--) {
            suffixZeros[i] = suffixZeros[i + 1] + (s.charAt(i) == '0' ? 1 : 0);
        }

        int minFlips = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            minFlips = Math.min(minFlips, prefixOnes[i] + suffixZeros[i]);
        }

        return minFlips;
    }
}