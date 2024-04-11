class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        final Set<Integer> set1 = new HashSet<>();
        final Set<Integer> set2 = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            set2.add(nums2[i]);
        }
        final Set<Integer> ans1 = new HashSet<>();
        final Set<Integer> ans2 = new HashSet<>();
        for(int i = 0; i < nums2.length; i++){
            if(!set1.contains(nums2[i])) ans1.add(nums2[i]);
        } 
        for(int i = 0; i < nums1.length; i++){
            if(!set2.contains(nums1[i])) ans2.add(nums1[i]);
        }
        final List<Integer> list1 = new ArrayList<>(ans2);
        final List<Integer> list2 = new ArrayList<>(ans1);
        return List.of(list1, list2);
    }
}