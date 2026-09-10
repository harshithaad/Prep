class Solution {
    public boolean rotateString(String s, String goal) {
        
        int n = s.length();
        if(s.length() != goal.length()) return false;

        String total = s+s;
        if(total.contains(goal)) return true;
        else return false;
    }
}