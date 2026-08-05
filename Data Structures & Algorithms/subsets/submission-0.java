class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>res=new ArrayList<>();
       find(list,res,nums,0);
        return list;
    }
    public static void find(List<List<Integer>>list,List<Integer>ree,int arr[],int start)
    {
        list.add(new ArrayList<>(ree));
        for(int i=start;i<arr.length;i++)
        {
            ree.add(arr[i]);
            find(list,ree,arr,i+1);
            ree.remove(ree.size()-1);
        }
        
    }
}
