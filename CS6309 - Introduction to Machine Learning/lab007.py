"""
For your activity, say we are given a data set of items, each having numerically valued features (like Height, Weight, Age, etc).
If the count of features is n, we can represent the items as points in an n-dimensional grid.
Given a new item, we can calculate the distance from the item to every other item in the set.
We pick the k closest neighbors, and we see where most of these neighbors are classified in.
We classify the new item there. So the problem becomes how we can calculate the distances between items.
Given a new item:
    1. Find distances between new item and all other items
    2. Pick k shorter distances
    3. Pick the most common class in these k distances
    4. That class is where we will classify the new item

Let our input file be in the following format:
Height, Weight, Age, Class
1.70, 65, 20, Programmer
1.90, 85, 33, Builder
1.78, 76, 31, Builder
1.73, 74, 24, Programmer
1.81, 75, 35, Builder
1.73, 70, 75, Scientist
1.80, 71, 63, Scientist
1.75, 69, 25, Programmer
"""

import math
from random import shuffle


def read_data(file_name):
    # Read the file, splitting by lines
    f = open(file_name, 'r')
    lines = f.read().splitlines()
    f.close()

    # Split the first line by commas, remove the first element and save the rest into a list.
    # The list holds the feature names of the data set.
    features = lines[0].split(', ')[:-1]

    results = []

    for i in range(1, len(lines)):
        line = lines[i].split(', ')
        item_features = {'Class': line[-1]}

        for j in range(len(features)):
            # Get the feature at index j
            f = features[j]

            # Convert feature value to float
            v = float(line[j])

            # Add feature value to dict
            item_features[f] = v

        results.append(item_features)

    shuffle(results)

    return results


def euclidean_distance(x, y):
    # The sum of the squared differences of the elements
    s = 0

    for key in x.keys():
        s += math.pow(x[key] - y[key], 2)

    # The square root of the sum
    return math.sqrt(s)


def calculate_neighbors_class(neighbors, k):
    count = {}

    if k > len(neighbors):
        k = len(neighbors)

    for i in range(k):
        if neighbors[i][1] not in count:
            # The class at the ith index is not in the count dict. Initialize it to 1.
            count[neighbors[i][1]] = 1
        else:
            # Found another item of class c[i]. Increment its counter.
            count[neighbors[i][1]] += 1
    return count


# Find max in dictionary, return max value and max index
def find_max(diction):
    maximum = -1
    classification = ''

    for key in diction.keys():
        if diction[key] > maximum:
            maximum = diction[key]
            classification = key

    return classification, maximum


def classify(n_item, k, items):
    # Hold nearest neighbours. First item is distance, second class
    neighbors = []

    for item in items:
        # Find Euclidean Distance
        distance = euclidean_distance(n_item, item)

        # Update neighbors, either adding the current item in neighbors or not.
        neighbors = update_neighbors(neighbors, item, distance, k)

    # Count the number of each class in neighbors
    count = calculate_neighbors_class(neighbors, k)

    # Find the max in count, aka the class with the most appearances
    return find_max(count)


def update_neighbors(neighbors, item, distance, k):
    if len(neighbors) < k:

        # List is not full, add
        # new item and sort
        neighbors.append([distance, item['Class']])
        neighbors = sorted(neighbors)
    else:

        # List is full Check if new
        # item should be entered
        if neighbors[-1][0] > distance:
            # If yes, replace the
            # last element with new item
            neighbors[-1] = [distance, item['Class']]
            neighbors = sorted(neighbors)

    return neighbors


def k_fold_validation(k1, k2, items):
    if k1 > len(items):
        return -1

    # The number of correct classifications
    correct = 0

    # The total number of classifications
    total = len(items) * (k1 - 1)

    # The length of a fold
    l = int(len(items) / k1)

    for i in range(k1):

        # Split data into training set
        # and test set
        training_set = items[i * l:(i + 1) * l]
        test_set = items[:i * l] + items[(i + 1) * l:]

        for item in test_set:
            item_class = item['Class']

            item_features = {}

            # Get feature values
            for key in item:
                if key != 'Class':
                    # If key isn't "Class", add
                    # it to item_features
                    item_features[key] = item[key]

            # Categorize item based on
            # its feature values
            guess = classify(item_features, k2, training_set)[0]

            if guess == item_class:
                # Guessed correctly
                correct += 1

    accuracy = correct / float(total)
    return accuracy


def evaluate(k1, k2, items, iterations):
    # Run algorithm the number of iterations, pick average
    accuracy = 0

    for i in range(iterations):
        shuffle(items)
        accuracy += k_fold_validation(k1, k2, items)

    print(accuracy / float(iterations))


items = read_data('lab007.txt')

evaluate(5, 5, items, 100)
