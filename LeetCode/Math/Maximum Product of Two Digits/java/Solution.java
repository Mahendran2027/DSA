class Solution {
    public int maxProduct(int n) {
      int t=String.valueOf(n).length();
      int arr[]=new int[t];
      int i=0;
      while(n!=0)
      {
        int d=n%10;
        arr[i]=d;
        n/=10;
        i++;
      }
      int max=0;
int p=1;
      for(int k=0;k<arr.length;k++)
      
      {
        for(int j=k+1;j<arr.length;j++)
        {
            p=arr[k]*arr[j];
            if(p>max)
            {
                max=p;
            }
        
        }
      }
      return max;
    }
}