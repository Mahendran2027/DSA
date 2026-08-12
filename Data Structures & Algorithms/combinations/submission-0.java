class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>list=new ArrayList<>();
        find(n,k,list,new ArrayList(),1);
        return list;
    }
    public static void find(int num,int k,List<List<Integer>>list,List<Integer>temp,int j)
    {
        if(temp.size()==k)
        {
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=j;i<=num;i++)
        {
            temp.add(i);
            find(num,k,list,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}