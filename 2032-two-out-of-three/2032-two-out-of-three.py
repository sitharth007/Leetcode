class Solution:
    def twoOutOfThree(self, nums1: List[int], nums2: List[int], nums3: List[int]) -> List[int]:
        l1 = len(nums1)
        l2 = len(nums2)
        l3 = len(nums3)

        res = []

        for i in range(l1):
            count = 1
            n = nums1[i]
            if n in nums2:
                count += 1
            if n in nums3:
                count += 1
            if count >= 2:
                if not n in res:
                    res.append(n)
            count = 1
        
        for i in range(l2):
            count = 1
            n = nums2[i]
            if n in nums1:
                count += 1
            if n in nums3:
                count += 1
            if count >= 2:
                if not n in res:
                    res.append(n)
            count = 1
        
        for i in range(l3):
            count = 1
            n = nums3[i]
            if n in nums2:
                count += 1
            if n in nums1:
                count += 1
            if count >= 2:
                if not n in res:
                    res.append(n)
            count = 1

        return res