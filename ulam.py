def ulam(n):
    while n != 1:
        if n % 2 == 0:
            n = n // 2
        else:
            n = 3 * n + 1
    return n


# Test the function with numbers up to 1M
for i in range(1, 1000000):
    result = ulam(i)
    if result != 1:
        print(f'Failed for the {i}: the {result}')
        break
print("All tests passed.")
