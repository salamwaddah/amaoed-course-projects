// Write a program using WHILE statement that displays a right triangle using asterisks where the height is at the left corner of the application. The height will depend on the user input.

#include <iostream>
using namespace std;

int main()
{
	int height;

	cout << "Input the height of the triangle: ";
	cin >> height;

	int row = 0;
	while (row < height)
	{
		row++;
		int column = 0;
		while (column < row)
		{
			cout << "*";
			column++;
		}
		cout << endl;
	}

	return EXIT_SUCCESS;
}
