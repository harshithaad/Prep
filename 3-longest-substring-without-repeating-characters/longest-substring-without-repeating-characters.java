class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0, right = 0, res = 0;

        HashSet<Character> hs = new HashSet<>();

        while(right < s.length()){
            char ch = s.charAt(right);

            while(hs.contains(ch)){
                hs.remove(s.charAt(left));
                left++;
            }
            
            hs.add(ch);
            res = Math.max(res, right-left+1);
            right++;
            

        }
        return res;
        
    }
}