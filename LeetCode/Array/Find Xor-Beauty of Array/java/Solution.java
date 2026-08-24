class Solution {
    public int xorBeauty(int[] nums) {
        int t=0;
        for(int num:nums)
        {
            t^=num;
        }return t;
    }
}