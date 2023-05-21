# Write a Python program to get observations of each species (setosa, versicolor, virginica) from iris data.

import pandas as pd

data = pd.read_csv("iris.csv")
print("Observations of each species:")
print(data['species'].value_counts())
