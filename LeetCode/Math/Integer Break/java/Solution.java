class Solution {
    public int integerBreak(int n) {
        if(n==2) return 1;
        if(n==3) return 2;
        int a = n%3;
        int b = n/3;
        if(a==1){
            a=4;
            b= b-1;
        }
        if(a==0) a= 1;
        return (int)Math.pow(3,b)*a;
    }
}