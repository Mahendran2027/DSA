class Solution {
    public int[] countBits(int n) {
       int arr[]=new int[n+1];
        for(int i=0; i<=n; i++){
                String str = "";  int y=i;          
            if (y == 0){
               arr[i]=0;
            }
           else{
                while(y > 0){
                    int num = y%2;
                   if(num==1) str += num;
                    y /= 2;
                }
                arr[i]=str.length();}
            
            
        }
        return arr;
    }

}