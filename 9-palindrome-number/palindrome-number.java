class Solution {
    public boolean isPalindrome(int x) {
    //     if (x < 0) return false;
    //    int temp = x ;
    //    int rev = 0;
    //    while(temp > 0){
    //     int lastdigit = temp % 10 ;
    //     rev = rev * 10 + lastdigit;
    //     temp = temp/10;
    //    }   
    //    return (x == rev);
    int temp = x;
        int rev = 0;  
        int rem;
        if(x<0){
            return false;
        }
        while(temp != 0){
            rem = temp%10;
            rev = rev * 10 + rem;
            temp = temp/10; 
        }
        if(x == rev){
            return true;
        }
        else return false;
 }
}