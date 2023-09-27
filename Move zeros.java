class Solution {
    public static void moveZeroes(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap the non-zero element with the element at index
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;

                // Increment the index to prepare for the next non-zero element
                index++;
            }
        }
    }
}
