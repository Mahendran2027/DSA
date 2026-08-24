class Solution {
    public String removeOccurrences(String s, String part) {
        int r=0;
        StringBuilder sb=new StringBuilder(s);
        while(r<s.length())
        {
             if(r+part.length()<=s.length())
             {
                String str=s.substring(r,r+part.length());
                if(str.equals(part))
                {
                    s=s.substring(0,r)+s.substring(r+part.length());
                    r=0;
                    continue;
                }

             }
             r++;
        }
        return s;
    }
}