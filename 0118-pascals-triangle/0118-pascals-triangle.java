class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> result=new ArrayList<>();
        for(int i=1;i<=n;i++){
            List<Integer> ans=new ArrayList<>(i);
            int num=1;
            ans.add(num);
            for(int j=1;j<i;j++){
                num*=i-j;
                num/=j;
                ans.add(num);
            }
            result.add(ans);

        }
        return result;
    }
}