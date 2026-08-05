class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];int y=0;
        for(int i=0;i<=n;i++)
        {
            y=Integer.bitCount(i);
            arr[i]=y;
        }
        return arr;
    }
}
