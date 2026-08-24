class Solution {
    public String reversePrefix(String s, int k) {
       
       String t=new StringBuilder(s.substring(0,k)).reverse().toString();
       String h=s.substring(k,s.length());
       return t+h;
    }
}