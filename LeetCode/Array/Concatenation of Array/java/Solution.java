class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int result[]=new int[2*n];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            result[i]=nums[i];
            j++;
        }
            int k=0;
          for(int i=j;i<result.length;i++)
          {
              result[i]=nums[k];
             k++;
          }
       return result;
        
    }
}