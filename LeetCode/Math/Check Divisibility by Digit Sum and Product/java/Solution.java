class Solution {
    public boolean checkDivisibility(int n) {
      int p=1;
      int s=0;
      int num=n;
      int check=n;
        while(num!=0)
        {
            int d=num%10;
            s+=d;
            p*=d;
            num/=10;
        }
       int sum=p+s;
      
        return n%sum==0;
    }
}