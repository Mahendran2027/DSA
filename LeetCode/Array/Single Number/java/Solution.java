class Solution {
    public int singleNumber(int[] nums) {
        int temp=nums[0];
        int y=0;
        for(int i=1;i<nums.length;i++)
        {
            y=temp^nums[i];
            temp=y;
        }
        return temp;
    }
}