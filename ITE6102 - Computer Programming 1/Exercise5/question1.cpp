// Write a program that will accept an integer and execute one of the following based on the input using IF statements:
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

	if (number == 0) {
		cout << "Hello World";
	} else if (number == 1) {
		cout << "I am Groot";
	} else if (number == 2) {
		cout << "To the Top”";
	} else if (number == 3) {
		cout << "Where is the horizon";
	} else if (number == 4) {
		cout << "I do not know";
	} else {
		cout << "Yeah, I will.";
	}

	return EXIT_SUCCESS;
}
