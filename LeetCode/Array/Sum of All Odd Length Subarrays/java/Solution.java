class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
     int sum=0;  for(int i=0;i<arr.length;i++)
       {
        for(int j=i;j<arr.length;j++)
        {
            List<Integer>list=new ArrayList<>();
            for(int k=i;k<=j;k++)
            {
                list.add(arr[k]);
            }
            if(list.size()%2==1)
            {
                for(int u:list)
                {
                    sum+=u;
                }
            }
        }
       } 
       return sum;
    }
}