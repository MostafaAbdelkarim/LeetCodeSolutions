class Solution {
    public int mostFrequentEven(int[] nums) {
        final Map<Integer,Integer> map= new HashMap<>();
        int val = 1000000;
        int freq = 0;
        for(int i : nums) {
            if( i%2 == 0) {
                int curr = map.getOrDefault(i, 0) + 1;
                map.put(i,curr);
                if(curr > freq || curr == freq && i < val) {
                    val = i;
                    freq = curr;
                }
            }
        }
        return freq == 0 ? - 1 : val;
    }
}