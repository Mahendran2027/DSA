class Solution {
    int count=0;
    public int countArrangement(int n) {
        boolean fetch[]=new boolean[n+1];
         permute(1,n,fetch);
        return count;

    }
    private  void permute(int pos,int n,boolean fetch[])
    {
        if(pos>n)
        {
            count++;
            return;
        }
       
        for(int i=1;i<=n;i++)
        {
             if(fetch[i])
        {
            continue;
        }
        if(pos%i==0||i%pos==0)
        {
           fetch[i]=true;
           permute(pos+1,n,fetch);
           fetch[i]=false;
        }
        }
    }
}