class Solution {
    public int[][] merge(int[][] intervals) {

        if(intervals.length == 0) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> res = new ArrayList<>();
        int[] newInterval = intervals[0];
        res.add(newInterval);

        for(int[] interval : intervals){
            if(interval[0] <= newInterval[1]){
                newInterval[1] = Math.max(interval[1], newInterval[1]);         
            }
            else{
                newInterval = interval;
                res.add(newInterval);
            }
        }

        return res.toArray(new int[res.size()][]);       
        
    }
}