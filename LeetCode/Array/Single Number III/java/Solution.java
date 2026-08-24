class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>list=new ArrayList<>();
        map.forEach((key, value) ->
        {
            if(value==1)list.add(key);
        
        });
        int arr[]=new int[list.size()];
         for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}