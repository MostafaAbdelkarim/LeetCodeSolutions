class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int counter = 0;
        int n = colors.length;
        if (n <= 2) return 0;
        for (int i = 0; i < n-2; i++) {
            if (colors[i] != colors[i+1] && colors[i+1] != colors[i+2]) {
                counter++;
            }
        }

        if (colors[1] != colors[0] && colors[0] != colors[n-1]) counter++;
        if (colors[0] != colors[n-1] && colors[n-1] != colors[n-2]) counter++;

        return counter;
    }
}