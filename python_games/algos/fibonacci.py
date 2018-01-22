# dynamic programming = recursion + memoization + careful guessing


class Fibonacci(object):

    def recursive_fibonacci(self, number):
        # O(n!)
        if number == 0:
            return 0
        elif number == 1:
            return 1
        else:
            return self.recursive_fibonacci(number - 1) + self.recursive_fibonacci(number - 2)

    def dp_fibonacci(self, number):
        # O(N)
        if number == 0:
            return 0
        else:
            previous_fibonacci = 0
            current_fibonacci = 1
            for _ in range(number - 1):
                new_fibonacci = previous_fibonacci + current_fibonacci
                previous_fibonacci = current_fibonacci
                current_fibonacci = new_fibonacci

            return current_fibonacci


def test_fibonacci():
    assert Fibonacci().recursive_fibonacci(0) == 0
    assert Fibonacci().recursive_fibonacci(1) == 1
    assert Fibonacci().recursive_fibonacci(3) == 2
    assert Fibonacci().recursive_fibonacci(9) == 34


def test_dp_fibonacci():
    assert Fibonacci().dp_fibonacci(0) == 0
    assert Fibonacci().dp_fibonacci(1) == 1
    assert Fibonacci().dp_fibonacci(3) == 2
    assert Fibonacci().dp_fibonacci(9) == 34
