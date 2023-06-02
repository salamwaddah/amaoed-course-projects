"""
What Support vector machines do, is to not only draw a line between two classes here,
but consider a region about the line of some given width.
Your activity is to write a python program that draw a line between a region.

Given sets of data:
    (1, 0.65, 0.33)
    (0.5, 1.6, 0.55)
    (-0.2, 2.9, 0.2)
"""
import numpy as np
import matplotlib.pyplot as plt

# creating linspace between -1 to 3.5
xfit = np.linspace(-1, 3.5)

X = np.array([[1, 0.65, 0.33], [0.5, 1.6, 0.55], [-0.2, 2.9, 0.2]])
Y = np.array([1, 2, 3])

# plotting scatter
plt.scatter(X[:, 0], X[:, 1], c=Y, s=50, cmap='spring')

# plot a line between the different sets of data
for m, b, d in [(1, 0.65, 0.33), (0.5, 1.6, 0.55), (-0.2, 2.9, 0.2)]:
    yfit = m * xfit + b
    plt.plot(xfit, yfit, '-k')
    plt.fill_between(xfit, yfit - d, yfit + d, edgecolor='none', color='#AAAAAA', alpha=0.4)

plt.xlim(-1, 3.5)
plt.show()
