class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>>list=new ArrayList<>();
      backtrack(nums,0,list,new ArrayList<>());
      return list;
    }
    public static void backtrack(int arr[],int start,List<List<Integer>>list,List<Integer>res)
    {
        list.add(new ArrayList<>(res));
        for(int i=start;i<arr.length;i++)
        {
            res.add(arr[i]);
            backtrack(arr,i+1,list,res);
            res.remove(res.size()-1);
        }
    }
}