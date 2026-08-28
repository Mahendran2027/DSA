class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int []front=new int[n];
        for(int i=0;i<n;i++){
            front[i]=triangle.get(n-1).get(i);
        }
        for(int j=triangle.size()-1;j>0;j--){
            int []curr=new int[j];
            for(int i=0;i<curr.length;i++){
            curr[i]=Math.min(triangle.get(j-1).get(i)+front[i],triangle.get(j-1).get(i)+front[i+1]);
        }
            front=curr;
        }
        return front[0];
    }
}