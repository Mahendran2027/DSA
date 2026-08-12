class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>list=new ArrayList<>();
        find(nums,list,new ArrayList<>(),target,0,0);
        return list;
    }
    public static void find(
        int arr[],
        List<List<Integer>>list,
        List<Integer>temp,
        int found,
        int sum,
        int start)
        {
        if(sum==found)
        {
            list.add(new ArrayList<>(temp));
            return;
        }
        if(sum>found)
        {
            return;
        }
        for(int i=start;i<arr.length;i++)
        {
        temp.add(arr[i]);
        find(arr,list,temp,found,sum+arr[i],i);
        temp.remove(temp.size()-1);
        }


}
}
