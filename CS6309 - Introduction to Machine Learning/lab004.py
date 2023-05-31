"""
For this activity, you will create and implement a linear regression algorithm using the normal equation and gradient descent.
We will look at the diabetes dataset, which you can load from sklearn.
We will just use the third feature, which is the body mass index of the diabetes patients.
Using this, we want to predict a quantitative measure of disease progression, which is stored in y.
"""

from sklearn import datasets
import matplotlib.pyplot as plt

# Load the diabetes dataset
X, y = datasets.load_diabetes(return_X_y=True)

# Select the second feature corresponding to the bmi of the diabetes patients
X = X[:, 2].reshape((len(y), 1))
y = y.reshape((len(y), 1))

# Split the data into training/testing sets
X = X[:-100]
X_test = X[-100:]

# Split the targets into training/testing sets
y = y[:-100]
y_test = y[-100:]
m = len(y)

plt.plot(X, y, "b.")
plt.xlabel("$x_2$", fontsize=18)
plt.ylabel("$y$", fontsize=18)
plt.tight_layout()
plt.show()
