class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currSum = 0 ;
        int maxSum = nums[0];

        for(int i=0; i<n; i++){
            currSum = currSum + nums[i];
            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
}