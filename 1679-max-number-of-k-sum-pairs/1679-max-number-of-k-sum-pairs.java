class Solution {
    public int maxOperations(int[] nums, int k) {
        final HashMap<Integer, Integer> resultMap = new HashMap<>();
        int trials = 0;
        for(int num : nums){
            int comp = k - num;
            if(resultMap.containsKey(comp)){
                trials++;
                if(resultMap.get(comp) == 1) {
                    resultMap.remove(comp);
                } 
                else {
                    resultMap.put(comp, resultMap.get(comp) - 1);
                }
            }
            else {
                resultMap.put(num, resultMap.getOrDefault(num, 0) + 1);
            }
        }
        return trials;
    }
}