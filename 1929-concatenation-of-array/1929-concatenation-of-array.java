class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newArr = new int[2 * nums.length];
        int j = nums.length;
        for (int i = 0; i < nums.length; i++) 
        {
            newArr[i] = nums[i];
            newArr[j + i] = nums[i];
        }
        return newArr;
    }
}