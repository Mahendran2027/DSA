class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int getConcatenation[]=new int[2*n];
        for(int i=0;i<n;i++)
        {
            getConcatenation[i]=nums[i];
            getConcatenation[i+n]=nums[i];
    }
    return getConcatenation;
        }
        
}