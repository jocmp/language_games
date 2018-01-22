"https://leetcode.com/problems/median-of-two-sorted-arrays/description/"
" this is O(m+n) time :/"
import math


class Solution:
    def findMedianSortedArrays(self, nums1: list, nums2: list):
        combined_numbers = sorted(nums1 + nums2)
        center_of_numbers = len(combined_numbers) / 2.0
        if len(combined_numbers) % 2 == 0:
            return (combined_numbers[int(center_of_numbers - 1)] + combined_numbers[int(center_of_numbers)]) / 2.0
        else:
            return combined_numbers[math.trunc(center_of_numbers)]


def test_solution():
    assert Solution().findMedianSortedArrays([1, 3], [2]) == 2.0
    assert Solution().findMedianSortedArrays([1, 2], [3, 4]) == 2.5
