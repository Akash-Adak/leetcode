class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getKey()==e.getValue()) {
                list.add(e.getKey());
            }
        }

        return list.size()!=0? Collections.max(list):-1;
    }
}