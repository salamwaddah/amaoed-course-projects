# 2. Write a Python application that displays the array items in reverse order.

def display_array_reverse(arr):
    reversed_array = arr[::-1]
    for item in reversed_array:
        print(item)


my_array = [1, 2, 3, 4]
display_array_reverse(my_array)
