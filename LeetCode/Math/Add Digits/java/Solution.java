class Solution {
    public int addDigits(int num) {
        
        if(num==0)return 0;
       int result=num;
       while(result>9)
       {
        result=call(result);
       }
       return result;
    } 
    public static int call(int num)
    {  Stack<Integer>stack=new Stack<>();
        while(num!=0)
        {
            int d=num%10;
            stack.push(d);
            num/=10;
        }
        int sum=0;
        for(int t:stack)
        {
            sum+=t;
        }
        return sum;
}

}