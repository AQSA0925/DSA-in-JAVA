class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }


        String result = s+s;
        boolean flag = true;
        if(result.contains(goal)){
            flag = true;
        }
        else{
            flag = false;
        }
        return flag;
    }
}