class Solution:
    def lastStoneWeight(self, stones: list[int]) -> int:
        while len(stones) > 1:
            stones.sort(reverse=True)
            y = stones.pop(0)
            x = stones.pop(0)
            
            if y != x:
                stones.append(y - x)

        return stones[0] if stones else 0
