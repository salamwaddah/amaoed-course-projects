# Assessment/ Programming.
# Analyze the given problem carefully and write a program that satisfies the requirement. (20 points)

# Python Matplotlib : Pie Chart
# A pie chart refers to a circular graph which is broken down into segments i.e. slices of pie.
# It is basically used to show the percentage or proportional data where each slice of pie represents a category.

# For this activity,
#   you are task to create a python program that divides a circle into 4 sectors or slices
#   which represents the respective category (playing, sleeping, eating and working) along with the percentage they hold
#   (use the value applied to our example in area plot).
#   Now, if you have noticed these slices adds up to 24 hrs,
#   but the calculation of pie slices is done automatically for you.
#   In this way, pie charts are really useful
#   as you don’t have to be the one who calculates the percentage or the slice of the pie.:

import matplotlib.pyplot as plt

slices = [7, 2, 2, 13]
activities = ['playing', 'sleeping', 'eating', 'working']

plt.pie(
    slices,
    labels=activities,
    startangle=90,
    explode=(0, 0.1, 0, 0),
    autopct='%1.1f%%'
)

plt.title('Pie Chart')
plt.suptitle('Abdulsalam Alaraj')
plt.show()










