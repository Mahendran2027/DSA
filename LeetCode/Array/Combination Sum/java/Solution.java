class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
           List<List<Integer>>list=new ArrayList<>();
           search(list,new ArrayList<>(),arr,target,0,0);
           return list;
    }
    public static void search(List<List<Integer>>list,List<Integer>temp,int nums[],int found,int start,int current)
    {
        if(current==found)
        {
            list.add(new ArrayList<>(temp));
        }
         if(current>found)
            {
                return;
            }
        for(int i=start;i<nums.length;i++)
        {
           
            temp.add(nums[i]);
            search(list,temp,nums,found,i,current+nums[i]);
            temp.remove(temp.size()-1);
        }
    }
}