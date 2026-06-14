class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        
        while(lo <= hi){
        int mid = lo +(hi-lo)/2;
           if(mid + 1 < arr.length && arr[mid] < arr[mid+1]) lo = mid + 1;
           else{
             hi = mid - 1;
           }
        }
        return lo;
    }
}