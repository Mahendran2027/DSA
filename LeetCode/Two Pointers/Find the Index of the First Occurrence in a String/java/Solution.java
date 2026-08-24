class Solution {
    public int strStr(String haystack, String needle) {
        int k=needle.length();
        String tree="";
        int l=haystack.length()-k;
        for(int i=0;i<l+1;i++)
        {
           tree=haystack.substring(i,i+k);
           if(tree.equals(needle))
           {
            return i;
           }
        }return -1;
    }
}