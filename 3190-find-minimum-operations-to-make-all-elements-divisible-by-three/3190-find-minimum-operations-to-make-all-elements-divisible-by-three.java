class Solution {
    public int minimumOperations(int[] nums) {
        int operationCounter = 0;
        
        for (int num : nums) {
            if (num % 3 != 0) {
                int add = num + 1;
                if (add % 3 == 0) {
                    operationCounter++;
                    continue;
                }
                int sub = num - 1;
                if (sub % 3 == 0) {
                    operationCounter++;
                    continue;
                }
            }
        }
        
        return operationCounter;
    }
}