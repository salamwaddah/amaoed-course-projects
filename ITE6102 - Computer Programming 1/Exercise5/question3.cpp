// Write a program that will divide the two floating points entered by the user (first number entered divided by the second number entered). Make sure your application handles all possible scenarios with floating points.

#include <iostream>
using namespace std;

int main()
{
	float dividend;
	float divisor;
	float quotient;

	cout << "Input dividend: ";
	cin >> dividend;

	cout << "Input divisor: ";
	cin >> divisor;

	if (divisor == 0) {
		cout << "0 is not a valid divisor" << endl;
	} else {
		quotient = dividend / divisor;
		cout << quotient << endl;
	}

	return EXIT_SUCCESS;
}
