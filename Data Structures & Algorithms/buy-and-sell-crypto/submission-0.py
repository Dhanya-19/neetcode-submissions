class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        currentProfit=0
        maxProfit=0
        minPrice=prices[0]
        for i in range(1,len(prices)):
            minPrice=min(minPrice,prices[i])
            currentProfit=prices[i]-minPrice
            maxProfit=max(currentProfit,maxProfit)
        return maxProfit
        