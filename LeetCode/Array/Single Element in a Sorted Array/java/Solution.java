class Solution {
    public int singleNonDuplicate(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int uy:nums)
        {
            map.put(uy,map.getOrDefault(uy,0)+1);
        }
       
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getValue()==1)
                 return entry.getKey();
        }
        return 0;
    }
}