def multiply(x, n):
    if n == 1:
        return x
    return x + multiply(x, n-1)


print(multiply(2, 2))
print(multiply(3, 2))
print(multiply(2, 10))
