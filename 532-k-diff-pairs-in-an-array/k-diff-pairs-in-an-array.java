class Solution {
    public int findPairs(int[] nums, int k) {

    if(k<0) return 0;

    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    for(int i: nums){
        map.put(i, map.getOrDefault(i, 0)+1);
    }

    for(int ele : map.keySet()){
        if((k==0 && map.get(ele) > 1)
        || (k>0 && map.containsKey(ele + k))){
            count++;
        }
    }
    return count;

        
    }
}