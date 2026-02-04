class Solution {
    public boolean isAnagram(String s, String t) {
    int[] arr = new int[26];
    for(int i=0;i<s.length(); i++){
        int index = s.charAt(i) - 'a';
        arr[index] ++; //c-a = 3 
    }
    for(int i=0; i<t.length(); i++){
        int index = t.charAt(i)-'a';
        arr[index ]--;
    }
    for(int i=0;i<arr.length; i++){
        if(arr[i] != 0){
            return false;
        }  
    }
    return true;
    }
}
// we can use here hashmap or array
/*
we use array when we know input is fixed size
& elements are not different and small in line 

we use hashmap when input os large and uncertain
*/