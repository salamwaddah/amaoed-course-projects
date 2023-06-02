"""
We can see that the "elbow" on the graph above (where the inertia becomes more linear) is at K=2.
For your activity, write python code where we can
then fit our K-means algorithm one more time and plot the different clusters assigned to the data.
"""

import matplotlib.pyplot as plt
from sklearn.cluster import KMeans

x = [4, 5, 10, 4, 3, 11, 14, 6, 10, 12]
y = [21, 19, 24, 17, 16, 25, 24, 22, 21, 21]

data = list(zip(x, y))

kmeans = KMeans(n_clusters=2)
kmeans.fit(data)

plt.scatter(x, y, c=kmeans.labels_)
plt.show()
