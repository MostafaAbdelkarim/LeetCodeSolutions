class Solution {
    public int countKDifference(int[] nums, int k) {
        //O(NLogN) Solution
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for(int i: nums)
        {
            if(map.containsKey(i-k))
            {
                count += map.get(i-k);
                map.put(i, map.getOrDefault(i,0)+1);
            }
            else
            {
                map.put(i, map.getOrDefault(i,0)+1);
            }
        }
        return count;
    }
}

// O(n^2) solution
// int count=0;
//         for(int i=0;i<nums.length-1;i++)
//         {
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 if(Math.abs(nums[i]-nums[j])==k) count++;
//             }
//         }
//         return count;