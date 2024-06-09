class Solution {
    public int countNegatives(int[][] grid) {
        int counter = 0;
        for (int arr[] : grid) {
            counter += bst(arr);
        }
        return counter;
    }
    
    private int bst(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end-start) / 2;
            if (arr[mid] >= 0) {
                start = mid + 1;
            }
            else end = mid - 1;
        }
        return arr.length-start;
    }
    
}