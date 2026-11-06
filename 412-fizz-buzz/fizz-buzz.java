class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String> ls = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap();
        map.put(3, "Fizz");
        map.put(5, "Buzz");

        for(int i=1; i<=n; i++){

            StringBuilder sb = new StringBuilder();

            for(int key: map.keySet()){
                if(i%key == 0) sb.append(map.get(key));
            }

            if(sb.length() == 0){
                ls.add(Integer.toString(i));
            }
            else{
                ls.add(sb.toString());
            }     
        }
        return ls;

        
    }
}