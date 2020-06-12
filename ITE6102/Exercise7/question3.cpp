// Write a program that will ascendingly sort six (6) integers from the user. Use only four (4) variables (including the array).

#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{
	int n[6];

	cout << "You will enter 6 integers, when you're done the output will be ascendingly sorted" << endl;

	for (int i = 0; i < 6; i++)
	{
		cout << "Enter number #" << i + 1 << ": ";
		cin >> n[i];
	}

	// Sorting
	for (int i = 0; i < 6; i++)
	{
		for (int t = i; t < 6; t++)
		{
			if (n[i] > n[t])
			{
				int temp = n[i];
				n[i] = n[t];
				n[t] = temp;
			}
		}
	}

	cout << "The sorted numbers are: ";

	for (int i = 0; i < 6; i++) {
		cout << n[i] << ", ";
	}

	cout << endl;

	return EXIT_SUCCESS;
}
