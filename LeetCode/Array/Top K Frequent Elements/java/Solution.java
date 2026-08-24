class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int result[]=new int[k];
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=0;i<k;i++)
        {
        int max=Integer.MIN_VALUE;
        int element=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet())  {
         if (entry.getValue() > max)
          {
          max = entry.getValue();
          element = entry.getKey();
         }
        
}   result[i]=element;
         map.remove(element);

    
}return result;
    }
}