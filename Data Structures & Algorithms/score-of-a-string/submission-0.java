class Solution {
    public int scoreOfString(String s) {
        int sum=0;
      for(int i=0;i<s.length()-1;i++)
      {  int a=s.charAt(i+1)-s.charAt(i);
            sum+=Math.abs(a);
      }
      return sum;
    }
}