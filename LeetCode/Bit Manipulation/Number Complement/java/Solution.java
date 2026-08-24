class Solution {
    public int findComplement(int num) {
        int t=num;
        String str="";
        while(t!=0)
        {
            int d=t%2;
            str+=d;
            t/=2;
        }

        str = new StringBuilder(str).reverse().toString();
         str=str.replace('0','x');
        str=str.replace('1','0');
        str=str.replace('x','1');
         int result=Integer.parseInt(str,2);
         return result;
    }
}