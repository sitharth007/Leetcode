class Solution:
    def maxProduct(self, words: list[str]) -> int:
        
        n = len(words)
        max_len = 0

        for i in range(n):
            for j in range(i+1,n):
                a = set(words[i])
                b = set(words[j])

                if a.isdisjoint(b):
                    length = len(words[i]) * len(words[j])
                    max_len = max(length , max_len)
        
        return max_len
            