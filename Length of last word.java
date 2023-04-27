class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int r=0;
        while(n>0){
            if(s.charAt(--n) != ' ')
                r++;
            else if(r>0)
                return r;
        }
        return r;
    }
    }
