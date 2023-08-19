class Solution {
    public int firstUniqChar(String s) {
        int fr[]=new int[26];
        char[] chars=s.toCharArray();
        for(char c:chars){
            fr[c-'a']++;
        }
        for(int i=0;i<chars.length;i++){
            if(fr[chars[i]-'a']==1){ 
                return i;
            }
        }
        return -1;
    }
}
