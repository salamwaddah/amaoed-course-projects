// Write a program that accepts user’s daily budget and display the product of the daily budget and itself.
#include <iostream>
using namespace std;

int main() {
    string product = "";
	int amount = 0;

	cout << "Enter product name: " << endl;
	cin >> product;

	cout << "Enter amount: " << endl;
	cin >> amount;

	cout << product << " Daily budget: " << amount << endl;

    return EXIT_SUCCESS;
}
