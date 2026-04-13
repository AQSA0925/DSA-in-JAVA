class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int count = 0;
        for(int i=0;i<n;i++){
            char ch = word.charAt(i);
            if(ch >= 65 && ch <= 90){
                count++;
            }
        }
        return(count == n)||(count == 0) || (count == 1 && word.charAt(0) <= 'Z');
    }
}