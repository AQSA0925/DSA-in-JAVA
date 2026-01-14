class Solution {
    public int search(int[] arr, int target) {
       int n = arr.length ;
       int lo = 0, hi = n-1;

       while(lo<=hi){
        int mid = lo + (hi-lo)/2;
        if(arr[mid] == target) return mid;
        else if (arr[mid] <= arr[hi]){ // i am in rigth sorted array.
           if(target > arr[mid] && target <= arr[hi]) lo=mid+1;
           else hi = mid-1;
        }
        else if (arr[mid] > arr[hi]) {
            // im in leftt sorted array 
            if(arr[lo]<=target && target <= arr[mid]) hi = mid-1;
            else lo =mid +1;
        }
       }
       return -1;
    }
}