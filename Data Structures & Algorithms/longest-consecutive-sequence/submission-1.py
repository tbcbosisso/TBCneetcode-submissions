class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        num_set = set(nums)
        longest_streak = 0
        
        for num in num_set:
            # Only start a streak if 'num' is the absolute beginning of a sequence
            if (num - 1) not in num_set:
                current_num = num
                current_streak = 1
                
                # Incrementally check for the next numbers in the chain
                while (current_num + 1) in num_set:
                    current_num += 1
                    current_streak += 1
                    
                longest_streak = max(longest_streak, current_streak)
                
        return longest_streak