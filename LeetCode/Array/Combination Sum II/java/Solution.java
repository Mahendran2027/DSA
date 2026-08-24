class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        List<List<Integer>>list=new ArrayList<>();
        Arrays.sort(arr);
        findsum(arr,list,new ArrayList<>(),target,0,0);
        return list;
    }
    public static void findsum(int nums[],List<List<Integer>>list,List<Integer>rem,int search,int start,int current)
    {
        if(current==search)
        {
            list.add(new ArrayList<>(rem));
            return;
        }
        for(int i=start;i<nums.length;i++)
        {
            if(current +nums[i]>search) break;
            if(i>start && nums[i]==nums[i-1])continue;
             rem.add(nums[i]);
            findsum(nums,list,rem,search,i+1,current+nums[i]);
            rem.remove(rem.size()-1);
        }
    }
}