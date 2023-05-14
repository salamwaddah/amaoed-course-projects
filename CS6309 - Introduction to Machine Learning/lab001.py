import numpy as np

# Assessment/ Programming.
# Analyze the given problem carefully and write a program that satisfies the requirement. (15 points)

# 1.
# Write a code that creates an array with 5 elements filled with 1's.
# Display the output.

array = np.ones(5)
print(array)  # [1. 1. 1. 1. 1.]

# 2.
# Write a code that creates an array containing a range of evenly spaced intervals from 0 to 20 with a step size of 5.
# Display the output.

array = np.arange(0, 21, 5)
print(array)  # [ 0  5 10 15 20]

# 3.
# Write a code that merges the following arrays and in order.
# Display the output.

X = np.array([1, 4, 8, 7])
Y = np.array([2, 6, 3, 9])

merged = np.concatenate((X, Y))
print(merged)  # [1 4 8 7 2 6 3 9]
