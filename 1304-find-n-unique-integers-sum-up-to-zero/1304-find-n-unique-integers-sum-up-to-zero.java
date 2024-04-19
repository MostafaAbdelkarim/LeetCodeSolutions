class Solution {
    public int[] sumZero(int n) {
        int [] resultArray = new int[n];
        int num = 1;
        int start = 0;
        int end = resultArray.length-1;
        while(start < end) {
            resultArray[start] = num;
            resultArray[end] = (-num);
            num++;
            start++;
            end--;
        }  
        return resultArray;
    }
}