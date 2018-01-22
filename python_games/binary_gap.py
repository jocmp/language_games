
def solution(n: int):
    return recurse(bin(n)[2:], 0, 0)


def recurse(n: str, current_gap: int, longest_gap: int):
    if len(n) < 1:
        return longest_gap
    elif n[0] == '0':
        return recurse(n[1:], current_gap + 1, longest_gap)
    else:
        return recurse(n[1:], 0, max(current_gap, longest_gap))


def test_binary_gap():
    assert solution(1) == 0
    assert solution(1041) == 5
    assert solution(9) == 2
    assert solution(2147483647) == 0
    assert solution(51712) == 2
    assert solution(200) == 2
