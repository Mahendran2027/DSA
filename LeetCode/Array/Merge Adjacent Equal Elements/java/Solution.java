class Solution {
    public List<Long> mergeAdjacent(int[] nums) {

        Stack<Long> stack = new Stack<>();

        for (int i = 0; i < nums.length; i++) {

            long value = nums[i];

            while (!stack.isEmpty() && value == stack.peek()) {
                long x = stack.pop();
                value = x + value;
            }

            stack.push(value);
        }

        return new ArrayList<>(stack);
    }
}


