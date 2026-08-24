class Solution {
    public List<Integer> findMissingElements(int[] nums) {
      List<Integer>list=new ArrayList<>();
      Arrays.sort(nums);
      int start=nums[0];
      int end=nums[nums.length-1];
        Set<Integer>set=new HashSet();
        for(int n:nums)
        {
            set.add(n);
        }
        for(int i=start;i<=end;i++)
        {
            if(!set.contains(i))
            {
                list.add(i);
            }
        }

        return list;
    }
}