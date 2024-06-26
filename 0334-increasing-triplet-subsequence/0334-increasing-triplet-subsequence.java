class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;
        
        int smallest = Integer.MAX_VALUE;
        int middle = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
                        
            if (nums[i] <= smallest){
                smallest = nums[i];
            } 
            else if (nums[i] <= middle) {
                middle = nums[i];
            } 
            else {
                return true;
            }
        }        
        return false;
    }
}