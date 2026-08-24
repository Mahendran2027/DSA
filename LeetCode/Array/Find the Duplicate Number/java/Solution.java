class Solution {
    public int findDuplicate(int[] nums) {
        int temp=0;
       Set<Integer>set=new HashSet();
       for(int i=0;i<nums.length;i++)
       {

        if(!set.contains(nums[i]))
        {set.add(nums[i]);
        }
        else
          {
             temp=nums[i];
          }

       }
       return temp;
    }
}