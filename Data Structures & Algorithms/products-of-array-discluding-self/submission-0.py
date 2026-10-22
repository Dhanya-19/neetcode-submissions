class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        suffixProd=1
        prefixProd=1
        n=len(nums)
        result=[1]*n
        for i in range(0,len(nums)):
            result[i]=prefixProd
            prefixProd*=nums[i]
        
        for i in range(len(nums)-1,-1,-1):
            result[i]*=suffixProd
            suffixProd*=nums[i]
            
        return result
        