def sum_of_elements(a, n):
    if n==0:
        return 0
    
    return a[n-1]+sum_of_elements(a, n-1)


a = [1,2,3]
print(sum_of_elements(a, len(a)))
