class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>result=new ArrayList<>();
        if(s.length()<p.length())return result;
        int[]parr=new int[26];
        int []sarr=new int[26];
        int k=p.length();
        for(int i=0;i<k;i++)
        {
            sarr[s.charAt(i)-'a']++;
            parr[p.charAt(i)-'a']++;
        }

        if(Arrays.equals(parr,sarr))
        result.add(0);
        for(int i=k;i<s.length();i++)
        {
            sarr[s.charAt(i)-'a']++;
            sarr[s.charAt(i-k)-'a']--;
        
        if(Arrays.equals(parr,sarr)){
        result.add((i-k)+1);}
        
    }return result;
    }
}