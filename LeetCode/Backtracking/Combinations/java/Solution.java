class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>list=new ArrayList<>();
        search(n,k,list,new ArrayList<>(),1);
        return list;
    }
    public static void search(int n,int k,List<List<Integer>>list,List<Integer>temp,int start)
    {
        if(k==0)
        {
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<=n;i++)
        {
            temp.add(i);
            search(n,k-1,list,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}