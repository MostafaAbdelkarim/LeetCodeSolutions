class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i]==0){
                for(int j=i;j<n-1;j++){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
                n--;
            }
            if(nums[i]==0){
                i--;
            }
        }
    }
}