def factors(num):
    result = []
    for i in range(1, num + 1):
        if num % i == 0:
            result.append(i)
    return result

# Test cases
print(factors(45))  # [1, 3, 5, 9, 15, 45]
print(factors(53))  # [1, 53]
print(factors(64))  # [1, 2, 4, 8, 16, 32, 64]
