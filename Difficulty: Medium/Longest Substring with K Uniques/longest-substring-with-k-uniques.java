class Solution {
    public int longestKSubstr(String s, int k) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        int len = s.length();
        int low = 0;
        int high = 0;
        int res = -1;
        
        for(high = 0; high<len; high++){
            
            char c = s.charAt(high);
            map.put(c, map.getOrDefault(c, 0)+1);
            
            while(map.size()> k){
                
                char ch = s.charAt(low);
                map.put(ch, map.get(ch)-1);
                
                if(map.get(ch) == 0){
                    map.remove(ch);
                }
                low++;
            }
            
            if(map.size() == k){
                res = Math.max(res, high - low + 1);
            }
            
        }
        return res;
    }
}