class Solution:
    def fillCups(self, amount: list[int]) -> int:
        Sum = sum(amount)
        Max = max(amount)

        return max(Max,(Sum+1)//2)