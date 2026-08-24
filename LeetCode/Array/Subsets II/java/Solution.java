class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>list=new ArrayList<>();
        duplicate(list,new ArrayList<>(),nums,0);
        return list;
    }
    public static void duplicate(List<List<Integer>>list,List<Integer>result,int arr[],int start)
    {
        list.add(new ArrayList<>(result));
        Set<Integer>set=new HashSet<>();
        for(int i=start;i<arr.length;i++)
        {
           if(i>start&&arr[i]==arr[i-1])
           {
            continue;
           }
            result.add(arr[i]);
            duplicate(list,result,arr,i+1);
            result.remove(result.size()-1);
        }
    }
}