class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
         nums[i] = nums[i] * nums[i];
        }
        int[]res = new int [n];
        int left = 0;
        int right = n-1;
        
        for(int i = n-1 ;i >=0; i--){
            if(nums[left] > nums[right]){
                res[i] = nums[left];
                left++;
            }
            else{
                res[i] = nums[right];
                right--; 
            }
        }
        return res;
    }
}