def singleNumber(nums):
    result = 0
    for num in nums:
        result ^= num
    return result

# Example usage:
number1 = [2, 2, 1]
print(singleNumber(number1)) 