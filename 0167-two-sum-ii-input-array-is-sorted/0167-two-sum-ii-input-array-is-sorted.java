class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
        int left = 0;
        int right = numbers.length-1;
        while(left < right) {
            int add = numbers[left]+numbers[right];
            if(add == target) {
                output[0]=left+1;
                output[1]=right+1;
                return output;
            }
            else if(add < target) left++;
            else right--;
        }
        return output;
    }
}