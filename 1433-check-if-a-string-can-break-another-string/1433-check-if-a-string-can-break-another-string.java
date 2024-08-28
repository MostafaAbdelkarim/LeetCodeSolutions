class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        final char[] strArr1 = s1.toCharArray();
        final char[] strArr2 = s2.toCharArray();
        
        Arrays.sort(strArr1);
        Arrays.sort(strArr2);
        
        boolean canBreakS1 = true;
        boolean canBreakS2 = true;

        for (int i = 0; i < strArr1.length; i++) {
            if (strArr1[i] < strArr2[i]) {
                canBreakS1 = false;
            }
            if (strArr1[i] > strArr2[i]) {
                canBreakS2 = false;
            }
        }

        return canBreakS1 || canBreakS2;
    }
}