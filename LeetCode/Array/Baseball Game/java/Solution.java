import java.util.*;

class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("C")) {
                stack.pop();
            }

            else if (operations[i].equals("D")) {
                int x = stack.peek();
                stack.push(x * 2);
            }

            else if (operations[i].equals("+")) {
                int x = stack.pop();
                int y = stack.peek();

                stack.push(x);
                stack.push(x + y);
            }

            else {
                int x = Integer.parseInt(operations[i]);
                stack.push(x);
            }
        }

        int sum = 0;

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}