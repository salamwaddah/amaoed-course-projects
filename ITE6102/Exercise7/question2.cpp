// Write a program that will display an equilateral triangle with a height depending on the user.
// The minimum height is 1, the maximum height is 10.
// Use an array to display the specific character on the specific row.
// The array will be: { 0 := “A”, 1:= “B”, 2 := “C”, 3 := “D”, 4 := “E”, 5 := “F”, 6 := “G”, 7 := “H”, 8 := “I”, 9 := “J” }.
// You are limited to four (4) variables only (including the array).

#include <cstdlib>
#include <iostream>

using namespace std;

int main() {
	string a[10] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
	int i, j, k, n;
	cout << "Input height: ";
	cin >> n;

	if (n <= 10 && n >= 1)
	{
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n - 1; j++)
			{
				cout << " ";
			}

			for (j = 1; j <= (i * 2) - 1; j++)
			{
				cout << a[i - 1];
			}

			cout << endl;
		}
	}
	else
	{
		cout << "Mininum height is 1 and maximum is 10";
	}
}