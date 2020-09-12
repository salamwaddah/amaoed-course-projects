// Write a program that will accept five (5) integers and display them to the users. You are limited to using only two (2) variables (including the array).

#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{
	int n[5];

	cout << "You will enter 5 integers" << endl;

	for (int i = 0; i < 5; i++)
	{
		cout << "Enter number #" << i + 1 << ": ";
		cin >> n[i];
	}

	cout << "The numbers are: ";

	for (int i = 0; i < 5; i++) {
		cout << n[i] << ", ";
	}

	cout << endl;

	return EXIT_SUCCESS;
}
