class Solution {
    public boolean isIsomorphic(String s, String t) {
        char []tree=new char[256];
        char[]ree=new char[256];
        for(int i=0;i<s.length();i++)
        {
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(tree[ch1]==0&&ree[ch2]==0)
            {
                tree[ch1]=ch2;
                ree[ch2]=ch1;
            }
            else if(tree[ch1]!=ch2||ree[ch2]!=ch1)return false;
        }
        return true;
    }
}