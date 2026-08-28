class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int right=0;
        int n=nums.length;
        int c=0;
        double  max=Integer.MIN_VALUE;
        int sum=0;
                for(int i=right;i<n;i++)  
        {
            sum+=nums[i];
            c++;
            if(c==k)
            {
                max=Math.max(sum,max);
                sum-=nums[left];
                c--;
                left++;

            }
            
            
        } 
        return (max/k);
        
           }
}
