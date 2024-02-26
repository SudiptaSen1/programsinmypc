def count_digit(n):
    if n == 0:
        return 0
    return count_digit(n//10)+1


n = int(input("Enter a number to calculate the number of digits present in it : "))
print(count_digit(n))
