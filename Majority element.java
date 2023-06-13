class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int r=0;
        for(int n :nums){
             if(cnt==0){
                r=n;
             }  
             if(n==r)
        cnt+=1;
       else
        cnt-=1;
          
        }
        return r;
    }
}
