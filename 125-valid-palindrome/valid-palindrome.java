class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        boolean flag = true;
        int n = s.length();
        for(int i=0; i<n; i++){
           if(s.charAt(i) != s.charAt(n-1-i)){
            flag = false;
           }
        }
        return flag;
    }
}