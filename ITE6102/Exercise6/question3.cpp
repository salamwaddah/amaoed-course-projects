// Write a program using DO WHILE statement that displays an inverted equilateral triangle using asterisks. No asterisk should be adjacent to one another. The height will depend on the user input.
// [Hint]
// You can use an IF statement to eliminate the initial space for the first row.

#include <iostream>
using namespace std;

int main()
{
	int height;

	cout << "Input the height of the inverted triangle: ";
	cin >> height;

	int x;
	int s;
	int y = 0;

	do
	{
		x = height - y;
		s = 0;

		if (y != 0)
		{
			do
			{
				cout << " ";
				s++;
			} while (s < y);
		}

		if (x != 0)
		{
			do
			{
				cout << "*" << " ";
				x--;
			} while (x > 0);
		}

		cout << endl;
		y++;
	} while (y <= height);

	return EXIT_SUCCESS;
}
