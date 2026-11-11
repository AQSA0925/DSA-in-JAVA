class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int n : nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }

        ArrayList<Integer>ans = new ArrayList<>(freq.keySet());
        ans.sort((a,b)-> freq.get(b)-freq.get(a));

        int[]arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}