import math


def gsum(n):
    if n == 0:
        return 1.0
    small_ans = gsum(n-1)
    sum = 1/pow(2, n) + small_ans
    return sum


print(gsum(3))
