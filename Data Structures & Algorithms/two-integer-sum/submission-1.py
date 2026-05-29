class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for j in range(len(nums)):
            for i in range(j+1, len(nums)):
                if (target == nums[j] + nums[i]):
                    return [j,i]