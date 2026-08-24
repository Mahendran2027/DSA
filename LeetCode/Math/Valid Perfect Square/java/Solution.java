class Solution {
    public boolean isPerfectSquare(int num) {
       boolean t=false;
        for(long i=0;i*i<=num;i++)
        {
          if(i*i==num) t=true;
        }return t;
    }
}