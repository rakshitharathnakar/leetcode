class Solution {
    public int maxSubArray(int[] n) {
         int s=0;
        int m=n[0];
        for(int i=0;i<n.length;i++){
            s+=n[i];
            if(s>m)
               m=s;
            if(s<0)
               s=0;
    }
    return m;
    }
}
