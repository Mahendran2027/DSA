class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer>list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                list.add(i);
            }
        }
        if(list.size()==0)return new ArrayList<>();
        return list;
    }
}