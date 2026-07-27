class Solution {
    public int[] getConcatenation(int[] nums) {
        int x=2*nums.length;
        int[] ans=new int[x];
        for(int i=0;i<x/2;i++){
            ans[i]=nums[i];
        }
        for(int i=x/2;i<x;i++){
            ans[i]=ans[i-x/2];
        }

        return ans;
    }
}