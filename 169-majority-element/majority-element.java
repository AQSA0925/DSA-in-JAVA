class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int freq = Integer.MIN_VALUE;
        int max = 0;
         for(int n : nums){
            if(map.get(n)>max){
                max = map.get(n);
                freq = n;
            }
         }
       return freq;
    }
}