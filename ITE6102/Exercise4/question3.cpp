/*
Write a program that accepts user’s name, password and address and display them back using the format “Hi, I am user’s name. I live at user’s address.”.
Restrictions:
- Use only three variables.
- Make sure you support spaces.
**/
#include <iostream>
using namespace std;

int main() {
    string user = "";
	string password = "";
	string address = "";

	cout << "User's name: " << endl;
	cin >> user;

	cout << "Password: " << endl;
	cin >> password;

	cout << "Address: " << endl;
	cin >> address;

	cout << "Hi, I am " << user << ". I live at " << address << "." << endl;

    return EXIT_SUCCESS;
}
