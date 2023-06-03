# 5. Write a Python application that locates a missing number in an array with values between 10 and 20.

def find_missing_number(arr):
    all_numbers = list(range(10, 21))

    for num in all_numbers:
        if num not in arr:
            return num

    return None


my_array = [10, 11, 13, 14, 15, 16, 17, 18, 19, 20]
missing_number = find_missing_number(my_array)
print("Missing number:", missing_number)
