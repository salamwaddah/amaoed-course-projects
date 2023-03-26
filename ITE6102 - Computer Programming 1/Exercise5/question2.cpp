// Write a program that will accept an integer and execute one of the following based on the input using SWITCH statements:
// If 0, display only “Hello World”.
// If 1, display only “I am Groot”.
// If 2, display only “To the Top”.
// If 3, display only “Where is the horizon”.
// If 4, display only “I do not know”.
// If none of the above, display only “Yeah, I will.”.

#include <iostream>
using namespace std;

int main()
{
	int number;

	cout << "Enter a number: ";
	cin >> number;

	switch (number) {
	case 0:
		cout << "Hello World" << endl;
		break;
	case 1:
		cout << "I am Groot" << endl;
		break;
	case 2:
		cout << "To the Top”" << endl;
		break;
	case 3:
		cout << "Where is the horizon" << endl;
		break;
	case 4:
		cout << "I do not know" << endl;
		break;
	default:
		cout << "Yeah, I will." << endl;
	}

	return EXIT_SUCCESS;
}
