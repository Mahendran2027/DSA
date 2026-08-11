class Solution {
    public int missingNumber(int[] nums) {
       Set<Integer>set=new HashSet();
      
       for(int k:nums)
       {
        set.add(k);
       }
       List<Integer>list=new ArrayList<>();
       int start=0;
       int end=nums.length;
       for(int i=start;i<=end;i++)
       {
        if(!set.contains(i))list.add(i);
       }System.out.println(list);
      return list.get(0);
         
    }
}
