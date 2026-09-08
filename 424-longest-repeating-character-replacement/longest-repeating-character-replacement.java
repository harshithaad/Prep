class Solution {

    public int find(int[] freq){

        int maxCount = -1;

        for(int i=0; i<freq.length; i++){
            maxCount = Math.max(maxCount, freq[i]);
        }

        return maxCount;
    }

    public int characterReplacement(String s, int k) {

        int[] freq = new int[256];

        int low=0, high=0;
        int res = 0;
        int n = s.length();

        for(high=0; high<n; high++){

            freq[s.charAt(high)]++;

            int maxCount = find(freq);
            int len = high - low +1;
            int diff = len - maxCount;
            
            while(diff > k){
                freq[s.charAt(low)]--;
                low++;

                maxCount = find(freq);
                len = high-low+1;
                diff = maxCount - len;
                
            }
            res = Math.max(res, high-low+1);
        }
        return res;
        
    }
}