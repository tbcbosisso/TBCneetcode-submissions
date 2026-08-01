class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output=[0]*len(nums)
        #Product of all element in nums
        for i in range(len(nums)):
            output[i]= math.prod(nums[i+1:]) * math.prod(nums[:i])
        #output[i]= product of every number in nums except nums[i]
        return output