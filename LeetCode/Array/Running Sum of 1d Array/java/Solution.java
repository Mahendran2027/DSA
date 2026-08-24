class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int y=nums[0];
        for(int i=1;i<n;i++)
        {
            y+=nums[i];
            nums[i]=y;
        }return nums;
    }
}