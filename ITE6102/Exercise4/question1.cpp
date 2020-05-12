// Write a program that accepts user’s section, and display them back with the format “*** Section: user’s section ***”.
#include <iostream>
using namespace std;


int main() {
    string user = "";

	cout << "Enter Section: " << endl;
	cin >> user;

	cout << "*** Section: " << user << " ***" << endl;

    return EXIT_SUCCESS;
}
