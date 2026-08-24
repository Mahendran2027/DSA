class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.replaceAll("[^a-zA-Z]"," ");
        String[]arr=paragraph.toLowerCase().split("\\s+");
        Map<String,Integer>map=new HashMap<>();
        for(String tree:arr)
        {
            if(tree.equals(" "))continue;
            boolean isretu=false;
            for(String t:banned)
            {
                if(tree.equalsIgnoreCase(t))
                {
                    isretu=true;
                    break;
                }
            }
            if(!isretu)
            {
                map.put(tree,map.getOrDefault(tree,0)+1);
            }
        }
     String answer = "";
        int max = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() > max) {
                max = entry.getValue();
                answer = entry.getKey();
            }
        }

        return answer;
}}