class Solution {
    public int lengthOfLongestSubstring(String s) {

        int low = 0, high = 0;
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(high =0; high< s.length(); high++){

            char c = s.charAt(high);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while(map.get(c) > 1){

                char leftChar = s.charAt(low);
                map.put(leftChar, map.get(leftChar) -1);

                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                low++;
            }        
            res = Math.max(res, high-low+1); 
        }        
        return res;
    }
}