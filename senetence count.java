class Solution {
    public int mostWordsFound(String[] sentences) {
        int mx=0;
        for(String sntnc:sentences){
            int r=sntnc.split(" ").length;
            mx=Math.max(mx,r);
        }
         return mx;
    }
}
