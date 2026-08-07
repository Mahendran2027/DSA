class Solution {
    public int findLucky(int[] arr) {
        int max=-1;
        Map<Integer,Integer>map=new HashMap<>();
        for(int k:arr)
        {
            map.put(k,map.getOrDefault(k,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getKey()==entry.getValue())
            {
                if(entry.getValue()>max)
                {
                    max=entry.getValue();
                }
            }
        }return max;
    }
}