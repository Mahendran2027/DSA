class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean>divise=new ArrayList<>();
        int current=0;
        for(int num:nums)
        {
            current=(current*2+num)%5;
            divise.add(current==0);
        }
        return divise;
    }
}