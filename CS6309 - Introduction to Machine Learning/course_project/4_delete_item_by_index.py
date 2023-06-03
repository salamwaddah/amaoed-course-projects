# 4. Write a Python program that deletes a specified item using the index from an array.

def delete_item_by_index(arr, index):
    if index < 0 or index >= len(arr):
        print("Invalid index!")
        return

    del arr[index]


my_array = [1, 2, 3, 4]
index_to_delete = 2
delete_item_by_index(my_array, index_to_delete)
print(my_array)
