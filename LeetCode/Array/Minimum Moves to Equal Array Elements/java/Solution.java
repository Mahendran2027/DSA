class Solution {
    public int minMoves(int[] nums) {
        if(nums.length==0)return 0;
        Stack<Integer>stack=new Stack<>();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(stack.isEmpty())
            {
                stack.push(nums[i]);
            }
            
            else if(nums[i]<stack.peek())
            {
                int fetch=stack.pop();
                int tree=nums[i];
                count+=(fetch-tree)*i;
                stack.push(tree);
            }
            else
            {
                count+=(nums[i]-stack.peek());
               // stack.push(nums[i]);
            }
    

        }
        System.out.println(stack);return count;
    }
}