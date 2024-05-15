class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for (int item: hours) {
            if (item >= target) {
                count++;
            }
        }
        return count;
    }
}