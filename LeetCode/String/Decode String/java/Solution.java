class Solution {
    public String decodeString(String s) {
        Stack<Integer>number=new Stack<>();
        Stack<StringBuilder>variable=new Stack<>();
        int current=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char  c=s.charAt(i);
            if(Character.isDigit(c))
            {
                current=current*10+(c-'0');
            }
            else if(c=='[')
            {
                   number.push(current);
                   variable.push(sb);
                  current =0;
                  sb=new StringBuilder();
            }
            else if(c==']')
            {
                int count=number.pop();
                StringBuilder print=variable.pop(); 
                for(int k=0;k<count;k++)
                {
                       print.append(sb);
                }
                sb=print;
            }
            else
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}