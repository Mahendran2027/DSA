class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      String sb="";
      String tr="";
        for(int i=0;i<word1.length;i++)
        {
            sb+=word1[i];
        
        }
        for(int i=0;i<word2.length;i++)
        {
            tr+=word2[i];
        }
     return sb.equals(tr);
    }
}