class Solution {
    public int countDistinctIntegers(int[] nums) {
        final Set<Integer> distinctIntegers = new HashSet<>();
        
        for (int num : nums) {
            distinctIntegers.add(num);
        }
        
        for (int num : nums) {
            distinctIntegers.add(reverseInteger(num));
        }
        
        return distinctIntegers.size();
    }
    
    private int reverseInteger(int number) {
        int reversed = 0;
        while (number != 0) {
            int remainder = number % 10;  
            reversed = reversed * 10 + remainder;  
            number = number/10;
        }
        return reversed;
    }
}