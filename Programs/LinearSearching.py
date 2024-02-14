def linear_search(arr, target):
    for i in range(len(arr)):
        if arr[i] == target:
            return i  
    return -1  

# Example usage:
arr = [4, 7, 2, 9, 1, 6]
target = 9

index = linear_search(arr, target)

if index != -1:
    print(f"Element {target} found at index {index}")
else:
    print(f"Element {target} not found in the array")