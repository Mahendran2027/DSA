class Solution {
    public int largestAltitude(int[] gain) {
        int arr[]=new int[gain.length+1];
        arr[0]=0;
        int s=0;
        int t=0;
        for(int i=1;i<arr.length;i++)
        {
              s+=gain[i-1];
              arr[i]=s;
              t=Math.max(s,t);
              
        }
        return t;
    }
}