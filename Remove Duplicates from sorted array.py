class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        l=1
        for r in range(l, len(nums)):
           if nums[r]!=nums[r-1]:
               nums[l]=nums[r]
               l+=1
        return l
