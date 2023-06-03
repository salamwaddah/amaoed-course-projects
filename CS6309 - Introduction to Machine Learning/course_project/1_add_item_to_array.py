# 1. Write a New Python application that adds a new item at the end of an array.

def add_item_to_array(arr, item):
    arr.append(item)


my_array = [1, 2, 3, 4]
new_item = 5
add_item_to_array(my_array, new_item)
print(my_array)
