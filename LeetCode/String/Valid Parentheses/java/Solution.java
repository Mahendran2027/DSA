class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
       char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='('||arr[i]=='['||arr[i]=='{')
            {stack.push(arr[i]);}
            else if(arr[i]==')'&&!stack.isEmpty()&&stack.peek()=='(') 
            {stack.pop();}
            else if(arr[i]==']'&&!stack.isEmpty()&&stack.peek()=='[')
            {stack.pop();}
            else if(arr[i]=='}'&&!stack.isEmpty()&&stack.peek()=='{')
            {stack.pop();}
            else return false;
        }
        return stack.isEmpty();
    }
}