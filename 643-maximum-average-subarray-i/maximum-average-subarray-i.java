class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double maxSum = 0;

        for(int right=0;right<k;right++){
            sum = sum + nums[right];
        }
        maxSum = sum;

        for(int right=k;right<nums.length;right++){
            sum = sum - nums[right - k] + nums[right];
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum/k;
    }
}