class Solution {
public:
    int jump(vector<int>& nums) {
        int j=0;
        int c=0;
        int f=0;
        for(int i=0;i<nums.size()-1;i++){
            f=max(f,nums[i]+i);
            if(i==c){
                c=f;
                j++;
            }
        }
        return j;
    }
};
