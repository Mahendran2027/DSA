class Solution {
    public int missingMultiple(int[] nums, int k) {
       Set<Integer>set=new HashSet<>();
       for(int num:nums)
       {
        set.add(num);
       }
       int given=k;
       while(set.contains(given))
       {
        given+=k;
       }
           return given;
    }
}