class Solution {
    public String removeStars(String s) {
        Stack<Character>stack=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(!stack.isEmpty()&&c=='*') stack.pop();
            else stack.push(c);
            
        }
        StringBuilder sb=new StringBuilder();
        for(char t:stack)
        {
            sb.append(t);
        }
        return sb.toString();
       
    }
}