class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> firstSet = new HashSet<>();
        HashSet<Integer> secondSet = new HashSet<>();
        
        for(Integer n: nums1){
            firstSet.add(n);
        }
        for(Integer n: nums2){
            secondSet.add(n);
        }
        if(firstSet.size() < secondSet.size()) {
            return helper(firstSet, secondSet);
        }
        else return helper(secondSet, firstSet);
    }
    
    private int[] helper(HashSet<Integer> firstSet, HashSet<Integer> secondSet){
        int[] result = new int[firstSet.size()];
        int index = 0;
        for(Integer s: firstSet){
            if(secondSet.contains(s)){
                result[index++] = s;
            }
        }
        return Arrays.copyOf(result, index);
    }
}