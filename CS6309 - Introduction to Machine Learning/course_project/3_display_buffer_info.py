# 3. Write a Python application that gets and displays the length of the element/s of a buffer that holds an array’s
# content and the present memory address. Also, find the size of the memory buffer in bytes.

import array


def display_buffer_info(arr):
    # Get the length of the elements in the buffer
    length = len(arr)

    # Get the memory address of the buffer
    address = arr.buffer_info()[0]

    # Get the size of the memory buffer in bytes
    size_bytes = arr.buffer_info()[1] * arr.itemsize

    print("Length of elements:", length)
    print("Memory address:", address)
    print("Size of memory buffer (in bytes):", size_bytes)


my_array = array.array('i', [1, 2, 3, 4])
display_buffer_info(my_array)
