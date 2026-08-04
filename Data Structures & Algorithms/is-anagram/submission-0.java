class Solution {
    public boolean isAnagram(String s, String t) {
       char[]c=s.toCharArray();
       char[]tt=t.toCharArray();
       Arrays.sort(c);
       Arrays.sort(tt);
      return  Arrays.equals(c,tt) ;
       
      
    }
}
