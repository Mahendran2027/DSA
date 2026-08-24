class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(num);
        }
        
        int[] digits = new int[sb.length()];
        for (int i = 0; i < sb.length(); i++) {
            digits[i] = sb.charAt(i) - '0';
        }
        
        return digits;
    }
}
