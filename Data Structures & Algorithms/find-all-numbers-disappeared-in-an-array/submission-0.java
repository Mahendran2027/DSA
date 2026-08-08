class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer>list=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
       Set<Integer>set=new HashSet<>();
       for(int i:nums) set.add(i);
    for(int i=1;i<=n;i++)
    {
        if(!set.contains(i))
        {
           list.add(i);
        }
    }
    return list;
    }
}