class Solution {
    public int maxDifference(String s) {
        int max=0;
        int min=0;
        Map<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int odd=Integer.MIN_VALUE;
        int even=Integer.MAX_VALUE;
        for(int freq:map.values())
        {
            if(freq%2!=0)
            {
                odd=Math.max(odd,freq);
            }
            else
            {
                even=Math.min(even,freq);
            }
        }
        return odd-even;
    }
}