# clearing all bits from i (right) to j (left) bit positions
# for clearRangeItoJ(63, 2, 4)
#      7 6 5 4  3 2 1 0    7 6 5 4  3 2 1 0
# 63 = 0 0 1 1  1 1 1 1 => 0 0 1 0  0 0 1 1 => 35
#            ------

def clearRangeItoJ(n, i, j):
    mask1 = (~0) << (j + 1)
    mask2 = ~((~0) << i)
    mask3 = mask1 | mask2
    # print (mask1, mask2, mask3)
    return n & mask3

print (clearRangeItoJ(63, 2, 4))
"""1048=100 0001 1000
21=100 0101 0100 = 1108
mask1=1111 000 0001
mask2=00000000011
mask1mask2=11110000011 = mask3
n=100 0001 1000 
mask3= 1111 000 0011
     = 100000000000
     = 1000 101 0001
   """
def replacebits(n,m,i,j)
n_clear= clearrangeItoJ

        :type nums: List(int)
        :rtype: int
        """
     
        ans = nums(0)
        for i in range(1, len(nums)):
            ans = nums(i)
            return ans
            print(Solution(). singlenumber([2,3,4,5,2,3,5]))           
            print(Solution(). singlenumber([2,3,4,5,2,3,5]))
https://www.geeksforgeeks.org/find-the-element-that-appears-once-in-a-sorted-array/

        


-----------------------------------------------------------------------

# https://leetcode.com/problems/single-number-iii/
# 260. Single Number III
class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        mask = 0
        for i in range(len(nums)):
            mask = mask ^ nums[i]
        pos = 0
        new_mask = mask
        while (new_mask & 1 != 1):
            pos += 1
            new_mask >>= 1
        new_mask = 1 << pos
        temp = 0
        for i in range(len(nums)):
            if (nums[i] & new_mask):
                temp = temp ^ nums[i]
        list1 = [temp, mask ^ temp]
        return list1
        
print (Solution().singleNumber([2,3,4,5,2,3]))
print (Solution().singleNumber([11,22,33,44,55,33,11,22]))








