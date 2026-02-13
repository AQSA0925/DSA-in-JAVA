class Solution {
    public boolean isPowerOfTwo(int n) {
        //baseCase 1 :
        if(n <= 0) return false;
        //baseCase 2;
        if(n == 1) return true;
        //baseCase 3;
        if(n % 2 != 0) return false;
        //recursive call;
        return isPowerOfTwo(n/2); 
    }
}