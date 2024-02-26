def fibonacci(i):
    if i == 0:
        return 0
    elif i == 1:
        return 1
    else:
        fibonacci_number = fibonacci(i-2)+fibonacci(i-1)
        return fibonacci_number
    

def main():
    for i in range(10):
        print(fibonacci(i))
    print(fibonacci(-1))


main()
