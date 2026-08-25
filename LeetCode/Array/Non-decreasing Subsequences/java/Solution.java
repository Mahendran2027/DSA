class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        collect(nums,list,new ArrayList<>(),0);
        return list;
    }
     public static void collect(int nums[],List<List<Integer>>list,List<Integer>result,int start)
    {
        if(result.size()>=2)
        {
            list.add(new ArrayList<>(result));
        }
        Set<Integer>set=new HashSet<>();
        for(int i=start;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                continue;
            }
             if(!result.isEmpty()&&nums[i]<result.get(result.size()-1))
            {
                continue;
            }
            set.add(nums[i]);
            result.add(nums[i]);
            collect(nums,list,result,i+1);
            result.remove(result.size()-1);
        }
    }
}