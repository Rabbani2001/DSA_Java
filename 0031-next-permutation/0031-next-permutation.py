class Solution(object):
    def nextPermutation(self, nums):
        n= len(nums)
        idx = -1
        for i in range(n-2,-1,-1):
            if(nums[i]<nums[i+1]):
                idx = i
                break
        if idx == -1:
            nums.reverse()
            return
        for j in range(n - 1, idx, -1):
            if nums[j] > nums[idx]:
                nums[j], nums[idx] = nums[idx], nums[j]
                break
        nums[idx+1:] = nums[idx+1:][::-1]
        
        