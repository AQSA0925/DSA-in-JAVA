// //Two pointer T.C = O(n^2)
// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int []ans = new int [2];
//         int n = numbers.length;

//         for(int i=0; i<n; i++){
//             for(int j = i+1; j<n; j++){
//                 if(numbers[i]+numbers[j] == target){
//                     ans[0] = i+1;
//                     ans[1] = j+1;
//                     return ans ;
//                 }
//             }
//         }
//         return ans ;
//     }
// }
// //

class Solution {
     public int[] twoSum(int[] numbers, int target){
        int n = numbers.length;
        int i=0;
        int j = n-1;

        while(i<j){
            int sum = (numbers[i] + numbers[j]);
            if(sum == target){
                return new int []{i+1,j+1};
            }
            if(sum > target){
              j--;
            }
            if(sum < target){
                i++;
            }
        }
        return new int []{-1,-1};
        }
     }



