class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>list=new ArrayList<>();
        boolean b[]=new boolean[nums.length+1];
        for(int i:nums)
        {
            if(b[i])list.add(i);
            b[i]=true;
        }
        return list;
    }
}