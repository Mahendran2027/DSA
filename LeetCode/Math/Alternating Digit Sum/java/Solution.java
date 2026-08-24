class Solution {
    public int alternateDigitSum(int n) {
        Stack<Integer>stack=new Stack<>();
        String value=String.valueOf(n);
        int sum=0;
     for(int i=0;i<value.length();i++)
     {
         int t=value.charAt(i)-'0';
         if(i%2==0)
         {
            sum+=t;
         }
         else
         {
            sum-=t;
         }
     }
     return sum;
    }
}