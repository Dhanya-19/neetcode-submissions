class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        seen=set()
        for num in nums:
            seen.add(num)
        currentCount=0
        maxCount=0
        for i in range(len(nums)):
            currentCount=0
            if nums[i]-1 not in seen:
                currentNum=nums[i]
                currentCount+=1
                while currentNum+1 in seen:
                    currentNum+=1
                    currentCount+=1
            maxCount=max(currentCount,maxCount)
        return maxCount    