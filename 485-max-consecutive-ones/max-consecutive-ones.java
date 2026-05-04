class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max = 0; //this stores the max 1's
        int current = 0;//this tells the current 1
        for(int i=0;i<n;i++){
            if(nums[i] == 1){
                current++;
                if(current > max ){
                    max = current;
                }
            }
            else{
                current = 0;
            }
        }
        return max;
    }
}