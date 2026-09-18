class Solution:
    def rob(self, nums: list[int]) -> int:
        
        max_rob = 0
        prev_rob = 0

        for cur in nums:
            temp = max(max_rob, prev_rob + cur)
            prev_rob = max_rob
            max_rob = temp
        
        return max_rob
