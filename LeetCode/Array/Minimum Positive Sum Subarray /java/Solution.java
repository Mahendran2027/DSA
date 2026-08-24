class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
      int minsum=Integer.MAX_VALUE;
        for(int i=l;i<=r;i++)
        {
            int current=0;
            for(int j=0;j<i;j++)
            {
                current+=nums.get(j);
            }
            if(current>0)
            {
              minsum=Math.min(minsum,current);
            }
            for(int k=i;k<nums.size();k++)
            {
                current+=nums.get(k);
                 current-=nums.get(k-i);
    
            if(current>0)
            {
                minsum=Math.min(minsum,current);
            }
            }
        }
        return (minsum==Integer.MAX_VALUE)?-1:minsum;
    }
}