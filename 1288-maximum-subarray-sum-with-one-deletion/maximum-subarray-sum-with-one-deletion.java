class Solution {
    public int maximumSum(int[] arr) {

        int n = arr.length;

        int nodelete = arr[0];
        int onedelete = arr[0];
        int ans = arr[0];

        for(int i=1; i<n; i++){
            
            onedelete = Math.max(onedelete+arr[i], nodelete);
            nodelete = Math.max(nodelete+arr[i], arr[i]);

            ans = Math.max(ans, Math.max(nodelete, onedelete));
        }
        return ans;
        
    }
}