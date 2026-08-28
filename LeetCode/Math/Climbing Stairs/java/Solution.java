class Solution {
    public int climbStairs(int n) {
        if(n<=3) return n;
        int p1=3;
        int p2=2;
        int s=0;
        for(int i=3;i<n;i++)
        {
            s=p1+p2;
            p2=p1;
            p1=s;
        }
        return s;
    }
}