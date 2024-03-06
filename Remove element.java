class Solution {
    public int removeElement(int[] nums, int val) {
        int r=nums.length;
        int f=0;
        for(int i=0;i<r;i++){
            if(nums[i]!=val){
                nums[f]=nums[i];
                f++;
            }
          
        }
          return f;
    }
}
