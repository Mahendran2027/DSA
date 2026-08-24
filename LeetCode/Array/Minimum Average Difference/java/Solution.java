class Solution {
    public int minimumAverageDifference(int[] arr) {
   long totalSum=0;
       for(int i:arr)
       {
        totalSum+=i;
       }
        long leftSum = 0;
        long min = Long.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            leftSum += arr[i];
            long rightSum = totalSum - leftSum;

            long leftAvg = leftSum / (i + 1);

            long rightAvg = 0;
            if (i != arr.length - 1) {
                rightAvg = rightSum / (arr.length - i - 1);
            }

            long diff = Math.abs(leftAvg - rightAvg);

            if (diff < min) {
                min = diff;
                index = i;
            }
        }

        return index;
    }
}
