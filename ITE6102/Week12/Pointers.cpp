#include <iostream>

using namespace std;

void pause()
{
	cout << endl;
	cout << "Press any key to continue...";
	cin.get();
}

int main()
{
	char a[] = "Hello world";
	cout << "The value of a is " << a << endl;
	cout << "The address of a is " << &a << endl;
	cout << "The address of the a[1] is " << (void *)&a[1] << endl;

	pause();
	return EXIT_SUCCESS;
}