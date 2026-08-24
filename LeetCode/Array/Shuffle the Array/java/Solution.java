class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=nums[i];
        }
        int t=0;
        for(int i=n;i<nums.length;i++)
        {
            arr2[t]=nums[i];
            t++;
        }
       int result[]=new int[nums.length];
       int j=0;
       int ky=0;
       for(int i=0;i<arr1.length;i++)
       {
        result[ky]=arr1[i];
        ky+=2;
        result[j+1]=arr2[i];
        j+=2;
      

       }
       return result;
    }
}