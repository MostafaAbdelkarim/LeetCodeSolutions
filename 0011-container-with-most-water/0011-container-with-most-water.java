class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;                
        int result = 0;
        while(start < end) {
            int area = Math.min(height[start], height[end]) * Math.abs(start - end);
            result = Math.max(area, result);
            if(height[start] < height[end]) start++;
            else end--;
        }
        return result;
    }
}