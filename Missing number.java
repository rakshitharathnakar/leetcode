class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int e=(n*(n+1))/2;
        int t=0;
        for(int num:nums)
        {
            t+=num;
        }
        return e-t;
    }
}
