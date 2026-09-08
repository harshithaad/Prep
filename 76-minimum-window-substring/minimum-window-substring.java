class Solution {

    public boolean sahi(int[] need, int[] have){
        
        for(int i=0; i<256; i++){
            if(have[i] < need[i]) return false;
        }
        return true;
    }

    public String minWindow(String s, String t) {

        int[] have = new int[256];
        int[] need = new int[256];

        int low=0, high =0;
        int n = s.length();
        int m = t.length();
        int res = Integer.MAX_VALUE, start= 0;
        

        for(int i=0; i<m; i++){
            need[t.charAt(i)]++;
        }
        
        for(high=0; high<n; high++){

            have[s.charAt(high)]++;

            while(sahi(need, have)){

                int len = high-low+1;
                if(len<res){
                    res = len;
                    start = low;                    
                }
                have[s.charAt(low)]--;
                low++;                
            }
        }
        if(res == Integer.MAX_VALUE) return "";

        return s.substring(start, start+res);        
    }
}