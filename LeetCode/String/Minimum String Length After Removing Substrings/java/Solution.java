class Solution {
    public int minLength(String s) {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char d=s.charAt(i);
            if(stack.isEmpty())
            {
                stack.push(d);
                continue;
            }
            else if(d=='B'&&stack.peek()=='A')
            {
                stack.pop();
            }
            else if(d=='D'&&stack.peek()=='C')
            {
                stack.pop();
            }
            else
            {
                stack.push(d);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:stack)
        {
            sb.append(c);
        }
        System.out.println(sb.length());
      
        return sb.length();
    }
}