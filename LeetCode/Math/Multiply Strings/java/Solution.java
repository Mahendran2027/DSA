class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int[] res = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {

                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';

                int p = a * b;

                int pos1 = i + j;
                int pos2 = i + j + 1;

                int sum = p + res[pos2];

                res[pos2] = sum % 10;
                res[pos1] += sum / 10;
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < res.length; i++) {
            if (ans.length() == 0 && res[i] == 0) {
                continue;
            }

            ans.append(res[i]);
        }

        return ans.toString();
    }
}