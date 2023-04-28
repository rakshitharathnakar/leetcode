class Solution {
    public int mySqrt(int x) {
        int s=1;
        int e=x;
        int r=0;
        while(s<=e){
            int m=s+(e-s)/2;
            if(m<=x/m){
                s=m+1;
                r=m;

            }
            else{
                e=m-1;
            }
        }
        return r;
    }
}
