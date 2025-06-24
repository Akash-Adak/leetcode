class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer>  ans=new ArrayList<>();
        List<Integer> index=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key) index.add(i);
        }
            int i=0,j=0;
            while(i<nums.length){
                 if(Math.abs(i-index.get(j))<=k && nums[index.get(j)]==key){
                    ans.add(i);
                    i++;
                 }
                 else{
                    if(j < index.size()) j++;
                    if(j>= index.size()) {
                        j=0;
                        i++;
                    }
                 }
            }
return ans;
        
    }
}