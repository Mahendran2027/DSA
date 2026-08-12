class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        find(nums,list,new ArrayList<>());
        return list;
    }
    public static void find(int arr[],List<List<Integer>>list,List<Integer>temp)
    {
        if(temp.size()==arr.length)
        {
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(temp.contains(arr[i]))continue;
            temp.add(arr[i]);
            find(arr,list,temp);
            temp.remove(temp.size()-1);
        }
    }
}
