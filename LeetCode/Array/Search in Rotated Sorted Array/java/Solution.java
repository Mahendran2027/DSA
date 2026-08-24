class Solution {
    public int search(int[] nums, int target) {
int j=0;
     boolean count =false;  for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
               count=true;
               j=i;
            }
        }
        if(count)return j;
        else return -1;
        
    }
}