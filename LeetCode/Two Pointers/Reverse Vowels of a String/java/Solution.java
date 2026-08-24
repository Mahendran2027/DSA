class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
        int l=0;
        int r=sb.length()-1;
        while(l<=r)
        {
            if(!isvowel(sb.charAt(l)))
            {
                l++;
            }
            else if(!isvowel(sb.charAt(r)))
            {
                r--;
            }
            else{
                char temp=s.charAt(l);
                sb.setCharAt(l,sb.charAt(r));
                sb.setCharAt(r,temp);
                l++;
                r--;
            }
        }
        return sb.toString();
    }
    public static boolean isvowel(char y)
    {
       y=Character.toLowerCase(y);
       return y=='a'||y=='e'||y=='i'||y=='o'||y=='u';
    }
}