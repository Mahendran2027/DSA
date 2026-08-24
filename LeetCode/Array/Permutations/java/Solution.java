class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
       
        fut(nums,0,list);
        return list;
    }
 
    public static void fut(int arr[],int start,List<List<Integer>>list)
    {
        if(start==arr.length)
        {
           List<Integer>temp=new ArrayList<>();
           for(int a:arr)
           {
            temp.add(a);
           }
           list.add(temp);
           return;
        }
        for(int i=start;i<arr.length;i++)
        {
            swap(arr,start,i);
            fut(arr,start+1,list);
            swap(arr,start,i);
        }
    }
    public static void swap(int tr[],int k,int y)
    {
        int temp=tr[k];
        tr[k]=tr[y];
        tr[y]=temp;
    }   
}
