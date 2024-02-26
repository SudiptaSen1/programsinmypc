def is_sorted(arr, n):
    if n==0 or n==1:
        return True
    
    if arr[n-1]>arr[n-2]:
        return False
    
    is_smaller_sorted = is_sorted(arr, n-1)
    return is_smaller_sorted



a = [1,2,4,3]
print(is_sorted(a, len(a)))
