def count_zero(n):
    if n == 0:
        return 0
    small_ans = count_zero(n//10)
    if n%10 == 0:
       return small_ans + 1
    return small_ans


print(count_zero(1200))
    