class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = 0;
        int  l = 0;
        int r = nums.length - 1;
        int[] p = new int[nums.length];
        p[0] = 1;
        for (int  i = 1; i < nums.length; i++) p[i] = (p[i - 1] * 2) % 1000000007;
        while (r >= l) {
            if (nums[l] + nums[r] <= target) {
                // ans = (ans + pow(r - l)) % 1000000007;
                ans = (ans + p[r - l]) % 1000000007;
                l += 1;
            }
            else r -= 1;
        }
        return ans;
    }
    // int pow(int k) {
    //     int b = 2;
    //     int m = 1000000007;
    //     long r  = 1;
    //     while (k > 0) {
    //         r = (r * 2) % m;
    //         k -= 1;
    //     }
    //     return (int)r;
    // }
}