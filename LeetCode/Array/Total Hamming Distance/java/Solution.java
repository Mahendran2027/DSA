class Solution {
    public int totalHammingDistance(int[] nums) {
     int sum=0;   for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                sum+=call(nums[i],nums[j]);
            }
        }
        return sum;
        
    }
    public static int call(int a,int b)
    {
       return Integer.bitCount(a^b);
}
}