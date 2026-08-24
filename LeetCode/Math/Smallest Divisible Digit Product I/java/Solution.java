class Solution {
    public int smallestNumber(int n, int t) {
        
        while(true)
        {
            int num=n;
            int p=1;
            while(num!=0)
            {
                int d=num%10;
                p*=d;
                num/=10;
            }
            if(p%t==0){return n;}
            else n++;
        }
}
}