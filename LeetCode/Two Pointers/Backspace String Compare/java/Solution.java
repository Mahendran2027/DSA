import java.util.*;

class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> stack = new Stack<>();

        for(char ct : s.toCharArray()) {

            if(ct == '#') {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else {
                stack.push(ct);
            }
        }

        Stack<Character> stack1 = new Stack<>();

        for(char ctd : t.toCharArray()) {

            if(ctd == '#') {
                if(!stack1.isEmpty()) {
                    stack1.pop();
                }
            }
            else {
                stack1.push(ctd);
            }
        }

        return stack.equals(stack1);
    }
}