class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        boolean isPalindrome = true;
        int n = s.length();
        int i=0;
        int j=n-1;

        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        return isPalindrome;
    }
}