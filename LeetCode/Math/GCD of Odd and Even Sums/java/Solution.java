class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=0;
        int even=0;
     for(int i=1;i<=n*2;i++)
     {
         if(i%2==0) even+=i;
         else odd+=i;
     }
  return findGCD(even,odd);
     
    }
    public static int findGCD(int a, int b) {
    if (b == 0) {
        return a;
    }
    return findGCD(b, a % b);
}

}