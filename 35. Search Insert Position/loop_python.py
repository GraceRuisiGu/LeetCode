class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        if len(nums)==0:
            return 0
        for i in range(len(nums)):
            if target<=nums[i]:
                return i
        return len(nums)
