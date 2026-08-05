class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       if(strs==null||strs.length==0)return new ArrayList<>();
       Map<String,List<String>>map=new HashMap<>();
       for(String f:strs)
       {
        char[]c=f.toCharArray();
        Arrays.sort(c);
        String t=String.valueOf(c);
        map.putIfAbsent(t,new ArrayList<>());
        map.get(t).add(f);
       }
        return new ArrayList<>(map.values());
    }
}
