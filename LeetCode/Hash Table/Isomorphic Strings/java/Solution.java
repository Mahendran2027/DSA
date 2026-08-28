class Solution {
    public boolean isIsomorphic(String s, String t) {
        int map1[]=new int[256];
        int map2[]=new int[256];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            char chr=t.charAt(i);
            if(map1[c]==0&& map2[chr]==0)
            {map1[c]=chr;
            map2[chr]=c;
            } else
            {
                if(map1[c]!=chr || map2[chr]!=c)
                return false;
            }

        }
        return true;
    }
}