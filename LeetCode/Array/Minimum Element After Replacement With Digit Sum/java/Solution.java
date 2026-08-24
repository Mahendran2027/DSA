class Solution {
    public int minElement(int[] nums) {
     int max=0;
        for(int i=0;i<nums.length;i++)
        {
            int t=nums[i];
               int s=0;
            while(t!=0)
            {
                int d=t%10;
                s+=d;
                t/=10;
                nums[i]=s;
               
            }
        }
     Arrays.sort(nums);
        return nums[0];
    }
}