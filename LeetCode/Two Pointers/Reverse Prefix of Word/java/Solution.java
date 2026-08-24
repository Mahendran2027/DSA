class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character>stack=new Stack<>();
    
        for(char c:word.toCharArray())
        {
           stack.push(c);
           if(c==ch)
           {
            break;
           }
        }
         if (stack.isEmpty() || stack.peek() != ch) {
            return word;
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        int index = word.indexOf(ch);
        String remaining = word.substring(index + 1);

        String result = sb.toString() + remaining;

        return result;
    }
}