class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ones = 0;
        int zero = 0;

        for (int num : nums) {
            if (num == 1) {
                zero++;
                ones = Math.max(ones, zero);
            } else {
                zero = 0;   
            }
        }
        return ones;
    }
}