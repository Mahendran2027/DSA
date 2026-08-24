class Solution {
    public int countSegments(String s) {
        s=s.trim();
      
       if(s.isEmpty())return 0;
       else  return s.split("\\s+").length;
        
    }
}