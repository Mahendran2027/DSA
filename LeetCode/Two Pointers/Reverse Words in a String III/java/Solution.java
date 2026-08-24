class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        String str="";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            StringBuilder ree=new StringBuilder(arr[i]);
         sb.append(ree.reverse().toString());   
         if(i<arr.length-1)
         {
            sb.append(" ");
         }
        }
       
        return sb.toString();
    }
}