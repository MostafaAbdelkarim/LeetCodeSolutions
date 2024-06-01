class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int len = nums.length;
        final List<Integer> targetList = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            targetList.add(index[i],nums[i]);  
        }
        final int[] target = new int[len];
        for (int i = 0; i < len; i++) {
            target[i] = targetList.get(i);  
        }
        return target;
    }
}