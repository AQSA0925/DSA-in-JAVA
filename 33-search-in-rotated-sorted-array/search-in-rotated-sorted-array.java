class Solution {
    public int search(int[] arr, int t) {
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid  = start+(end-start)/2;
            if(arr[mid] == t) return mid;
            
            //step 1 : we will identify which side is sorted
            //check left half is sorted or not;

            else if(arr[start] <= arr[mid]){
                if(arr[start]<=t && t < arr[mid])
                   end = mid -1;
                else start = mid + 1;
            } 
            else if (arr[mid] <t && t <= arr[end]){
                   start = mid + 1;
                   }
            else end = mid-1;
            }
        return-1;
}
}