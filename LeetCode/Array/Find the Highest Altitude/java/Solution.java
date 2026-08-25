class Solution {
    public int largestAltitude(int[] gain) {
        int result[]=new int[gain.length+1];
        int max=0;
        for(int i=1;i<=gain.length;i++)
        {
            result[i]=result[i-1]+gain[i-1];
            max=Math.max(max,result[i]);
        }
       
        return max;
    }
}