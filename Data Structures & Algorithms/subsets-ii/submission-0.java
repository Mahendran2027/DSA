class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>res=new ArrayList<>();
          Arrays.sort(nums);
        find(list,res,nums,0);
        return list;
    }
    public static void find(List<List<Integer>>list,List<Integer>rem,int arr[],int start){
         list.add(new ArrayList<>(rem));
         for(int i=start;i<arr.length;i++)
         {
            if (i > start && arr[i] == arr[i - 1]) {
                continue;
            }
            rem.add(arr[i]);
            find(list,rem,arr,i+1);
            rem.remove(rem.size()-1);
           
         }
    }
}
