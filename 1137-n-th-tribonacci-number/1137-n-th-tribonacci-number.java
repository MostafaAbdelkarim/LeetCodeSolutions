class Solution {
    public int tribonacci(int n) {
        int[] tribArr = new int[n+3];
        tribArr[0] = 0;
        tribArr[1] = tribArr[2] = 1;
        for(int i = 3; i <= n; i++)
        {
            tribArr[i] = tribArr[i-1] + tribArr[i-2] + tribArr[i-3];
        }
        return tribArr[n];
    }
}