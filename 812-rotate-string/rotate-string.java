class Solution {
    public boolean rotateString(String s, String goal) {

        
        int n = s.length();
        int idx = -1;

        if(s.length() != goal.length()) return false;

        String total = s + s;
        
        idx = total.indexOf(goal); 

        if(idx == -1) return false;
        else return true;       
    }
}