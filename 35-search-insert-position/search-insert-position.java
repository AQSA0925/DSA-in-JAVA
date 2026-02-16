class Solution {
    public int searchInsert(int[] nums, int target) {
        return insertPosition(nums,0,nums.length-1,target);
    }
    public int insertPosition(int[]nums, int start, int end, int target){
        //base case:
        if(start > end){
            return start;
        }
        //condition:
        int mid = start + (end-start)/2;

        //recursive call:
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] < target){
           return insertPosition(nums,mid+1,end,target);
        }
        else {
            return insertPosition(nums,start,mid-1,target);
        }
    }
}