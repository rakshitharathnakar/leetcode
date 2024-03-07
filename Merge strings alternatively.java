class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mgd=new StringBuilder();
        int mx=Math.max(word1.length(),word2.length());
        for(int i=0;i<mx;i++){
            if(i<word1.length()){
                mgd.append(word1.charAt(i));
            }
            if(i<word2.length()){
                mgd.append(word2.charAt(i));
            }
        }
        return mgd.toString();
    }
}
