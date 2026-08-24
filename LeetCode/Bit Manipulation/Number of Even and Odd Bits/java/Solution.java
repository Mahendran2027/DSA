class Solution {
    public int[] evenOddBit(int n) {
        String s=Integer.toBinaryString(n);
        List<Integer>list=new ArrayList<>();
        for(int i=s.length()-1;i>=0;i--)
        {
            list.add(s.charAt(i)-'0');
        }
        int odd=0;
    int even=0;
 for(int i=0;i<list.size();i++)
 {
     if(i%2==0&&list.get(i)!=0)even++;
     else if(i%2==1&&list.get(i)!=0)odd++;
 }
    return new int[]{even,odd};
}
}