class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String>tr=new ArrayList<>();
      for(int h=0;h<12;h++)
      {
        for(int m=0;m<60;m++)
        {
            int total=Integer.bitCount(h)+Integer.bitCount(m);
            if(total==turnedOn)
            {
                 String t=h+":"+(m<10?"0"+m:m);
                 tr.add(t);
            }
        }
      }return tr;
    }
}