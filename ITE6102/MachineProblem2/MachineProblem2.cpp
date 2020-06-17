// Write a C++ program with the following specifications:
// 1.   Use two-dimensional array with size 7 columns and 5 rows.
// 2.   Seat numbers are populated during run-time.
// 3.   User is asked to input a seat number.
// 4.   Seat number chosen is replaced by 0.
// 5.   Program displays a remark “Seat successfully reserved” when reservation is done.
// 6.   User is not allowed to reserve a previously reserved seat.  Display “Seat is taken” remarks.
// 7.   User is not allowed to enter an invalid seat number.  Display an error message.
// 8.   Program continuously loops.

// Sample Output:
// 1    2   3   4   5   6   7
// 8    9   10  11  12  13  14
// 15   16  17  18  19  20  21
// 22   23  24  25  26  27  28
// 29   30  31  32  33  34  35

// Enter seat number to reserve : 11

// 1    2   3   4   5   6   7
// 8    9   10  0   12  13  14
// 15   16  17  18  19  20  21
// 22   23  24  25  26  27  28
// 29   30  31  32  33  34  35

// Enter seat number to reserve :

#include <iostream>

using namespace std;

int main()
{
	int rows = 5;
	int cols = 7;
	int i, j;

	int seats[5][7] = {
		{1, 2, 3, 4, 5, 6, 7},
		{8, 9, 10, 11, 12, 13, 14},
		{15, 16, 17, 18, 19, 20, 21},
		{22, 23, 24, 25, 26, 27, 28},
		{29, 30, 31, 32, 33, 34, 35}};

	while (true)
	{
		int seatNumber;
		cout << "Input seat number: ";
		cin >> seatNumber;

		bool taken = true;

		if (seatNumber > 35)
		{
			cout << "\n Seat does not exist \n";
			taken = false;
		}

		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{

				if (seats[i][j] == seatNumber)
				{
					taken = false;
					cout << "\n Seat successfully reserved \n \n";
					seats[i][j] = 0;
				}
			}
		}

		if (taken == true)
		{
			cout << "\n Seat is taken \n \n";
		}

		for (i = 0; i < rows; i++)
		{
			for (j = 0; j < cols; j++)
			{
				cout << " " << seats[i][j] << " ";
			}
			cout << endl;
		}

		cout << endl;
	}
}
