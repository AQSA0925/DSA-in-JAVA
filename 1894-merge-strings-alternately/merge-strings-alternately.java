class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[]a1 = word1.toCharArray();
        char[]a2 = word2.toCharArray();

        int n1 = a1.length;
        int n2 = a2.length;

        int i=0; //for n1 & n2
        int k=0; // for merged array;

        char[] merged = new char [n1 + n2];

        while(i<n1 || i<n2){
            if(i < n1){
                merged [k++] = a1[i];
            }
            if( i < n2){
                merged [k++] = a2[i];
            }
            i++;
        }
        return new String(merged);
    }
}