// Write a program using FOR statement that displays a right triangle using asterisks where the height is at the right corner of the application. The height will depend on the user input.

#include <iostream>
using namespace std;

int main()
{
	int height;

	cout << "Input the height of the right height triangle: ";
	cin >> height;

	for (int i = 0, j = 0; i < height; i++, j += 2)
	{
		for (int k = 0; k < (height * 2) - j - 2; k++)
		{
			cout << " ";
		}

		for (int k = 0; k <= j; k++)
		{
			cout << "*";
		}

		cout << endl;
	}

	return EXIT_SUCCESS;
}
