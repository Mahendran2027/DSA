class Solution {
    public int findLucky(int[] arr) {
        int freq[]=new int[256];
          int max=-1;
        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]]++;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==freq[arr[i]])
            {
             
               if(arr[i]>max)
               {
                max=arr[i];

               }
            }
            
        }
        return max;
    }
}