class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
       for(int i=left;i<=right;i++)
       {
        int y=Integer.bitCount(i);
        if(isprime(y))
        {
            count++;
        }
       
       }
        return count;
    }
    public static boolean isprime(int u)
    {
        if(u<=1)return false;
        for(int i=2;i*i<=u;i++)
        {if(u%i==0)
        {
            return false;
        }
        }
        return true;
    }
}