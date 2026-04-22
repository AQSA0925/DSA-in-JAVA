class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int noOfZ = 0;
        int noOfO = 0;
        int noOfT = 0;

        for(int i=0; i<n; i++){
            if(nums[i] == 0) noOfZ++;
            if(nums[i] == 1) noOfO++;
            if(nums[i] == 2) noOfT++;
        }
        for(int i=0;i<n;i++){
            if(i < noOfZ) nums[i] = 0;
            else if(i < noOfZ + noOfO) nums[i] = 1;
            else nums[i] = 2;
        }
    }
}