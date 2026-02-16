class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        
        // 1. Array se min aur max nikaalo
        for (int i : nums) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        
        // 2. In do numbers ka GCD nikaalo
        return gcd(min, max);
    }
    
    // Recursive GCD Function (Euclidean Algorithm)
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}