class Solution {
    private boolean isPrime(int n){
        int c=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                c+=2;
            if(i*i==n){
                c--;
            }
            }
        }
        return c==2;
    }
    public int diagonalPrime(int[][] nums) {
        int res=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(isPrime(nums[i][i])){
                res=Math.max(res,nums[i][i]);
            }
        }
            for(int i=0;i<n;i++){
                if(isPrime(nums[i][n-i-1])){
                    res=Math.max(res,nums[i][n-i-1]);
                }
            }
          return res;
    }
}
