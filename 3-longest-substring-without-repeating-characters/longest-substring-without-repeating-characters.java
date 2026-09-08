class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        int low=0, high=0;
        int res = 0;
        int len = s.length();

        for(high = 0; high<len; high++){
            char c = s.charAt(high);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while(map.get(c) > 1){

                char leftChar = s.charAt(low);
                map.put(leftChar, map.get(leftChar) - 1);

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