class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        nums_set = set(nums)
        mydict = {}
        for unique_num in nums_set:
            count1 = 0
            for num in nums:
                if unique_num == num:
                    count1 += 1
            mydict[unique_num] = count1 
        highest_keys = sorted(mydict, key=mydict.get, reverse=True)[:k]
        return highest_keys