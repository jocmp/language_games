class Solution(object):
    def three_sum(self, numbers):
        numbers.sort()
        for i in range(len(numbers) - 2):
            a = numbers[i]
            start = i + 1
            end = len(numbers) - 1
            while start < end:
                b = numbers[start]
                c = numbers[end]
                if a + b + c == 0:
                    return [a, b, c]
                if a + b + c < 0:
                    start += 1
                else:
                    end -= 1

        return []


def test_three_sum():
    assert Solution().three_sum([-5, -3, 1, 2, 10]) == [-3, 1, 2]
    assert Solution().three_sum([-3, -2, -1, 0, 1, 17]) == [-1, 0, 1]
