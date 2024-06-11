class Solution {
    public int percentageLetter(String s, char letter) {
        int counter = 0;
        final int n = s.length();
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == letter) {
                counter++;
            }
        }
        return (counter*100/n);
    }
}