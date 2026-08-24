class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
         String arr[]=sentence.split(" ");
     for(int i=0;i<dictionary.size();i++)
        {
            String dtr=dictionary.get(i);
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j].startsWith(dtr))
                {
                    arr[j]=dtr;
                    
                }
            
            }

        }
        String result = String.join(" ", arr);
        return result;
       
    }
} 