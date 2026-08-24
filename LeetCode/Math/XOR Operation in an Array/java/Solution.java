class Solution {
    public int xorOperation(int n, int start) {
      int yt=0;
        for(int i=0;i<n;i++)
        {
           yt^=(start+2*i);
            System.out.println(yt);
    }
    return yt;
}
}
       