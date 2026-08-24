class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        Set<Integer>set3=new HashSet<>();
        for(int a:nums1)set1.add(a);
        for(int a:nums2)set2.add(a);
        for(int a:nums3)set3.add(a);
        Set<Integer>result=new HashSet<>();
        for(int y:set1)
        {
            if(set2.contains(y)||set3.contains(y))result.add(y);
        }
        for(int u:set2)
        {
            if(set3.contains(u))result.add(u);
        }
        return new ArrayList<>(result);
    }
}