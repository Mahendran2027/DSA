class Solution {
    public int compress(char[] c) {
        int count=1;
        int ind = 0;
        for(int i=1;i<c.length;i++)
        {
            if(c[i-1]==c[i])
            {
                count++;
            }
            else{
                if(count==1)
                {
                    // sb.append(c[i-1]);
                    c[ind++] = c[i-1];
                }
                else
                {
                    // sb.append(c[i-1]).append(count+"");
                    // count=1;
                    c[ind++] = c[i-1];

                    for(int j = 0 ; j < String.valueOf(count).length();j++){
                        c[ind++] = String.valueOf(count).charAt(j);
                    }
                    count = 1;
                }
            }
        }
        if(count==1)
                {
                    // sb.append(c[i-1]);
                    c[ind++] = c[c.length-1];
                }
                else
                {
                    // sb.append(c[i-1]).append(count+"");
                    // count=1;
                    c[ind++] = c[c.length-1];
                    for(int j = 0 ; j < String.valueOf(count).length();j++){
                        c[ind++] = String.valueOf(count).charAt(j);
                    }
                }
                return ind;
    }
}