// Write a program that accepts five (5) integers from the user and dispaly them back in one line.

#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{
	int n[5];

	for (int i = 0; i < 5; i++)
	{
		cout << "Enter number #" << i + 1 << ": ";
		cin >> n[i];
	}

	cout << "The numbers are: " << n[0] << ", " << n[1] << ", " << n[2] << ", " << n[3] << ", " << n[4] << endl;

	return EXIT_SUCCESS;
}
