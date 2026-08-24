class Solution {
    public int hammingWeight(int n) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        while(n!=0)
        {
            int d=n%2;
            n=n/2;
            sb.append(d);
        }for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)=='1')count++;
        }
        return count;
    }
}