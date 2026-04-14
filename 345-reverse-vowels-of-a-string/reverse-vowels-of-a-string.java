class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();
        char [] ch = s.toCharArray();
        for(int i=0; i<s.length();i++){
           if(ch[i] == 'a'||ch[i] == 'e'||ch[i] == 'i'||ch[i] == 'o'||ch[i] == 'u'||ch[i] == 'A'||ch[i] == 'I'||ch[i] == 'E'||ch[i] == 'O'||ch[i] == 'U'){
            list.add(ch[i]);
           }
        }

        int j = list.size()-1;
        for(int i=0; i<s.length();i++){
           if(ch[i] == 'a'||ch[i] == 'e'||ch[i] == 'i'||ch[i] == 'o'||ch[i] == 'u'||ch[i] == 'A'||ch[i] == 'I'||ch[i] == 'E'||ch[i] == 'O'||ch[i] == 'U'){
        ch[i] = list.get(j);
          j--;
           }
        }
        String ans = new String(ch);
        return ans;
    }
}