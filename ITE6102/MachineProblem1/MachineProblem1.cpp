// Write a C++ program that will ask for the following input from the user:
	// Student Name:
	// Program/Course:
	// Year Level: (should be integer type)
	// Number of Units Enrolled: (should be double or float data type)

// Determine the corresponding year name of the student and rate per unit as follows:
	// Year Level	Year Name	Rate Per Unit
	// 1			Freshman	1,500
	// 2			Sophomore	1,800
	// 3			Junior 		2,000
	// 4 or 5		Senior		2,300

// Compute the tuition fee as follows:
	// Tuition fee = no. of units enrolled X rate per unit
	// Down payment = 30% of the tuition fee
	// Balance = tuition fee – down payment

// Assume that the user will not enter an invalid value.

// Sample Input:
	// Student Name: Maria Blanco
	// Program/Course: Bachelor of Science in Information Technology
	// Year Level: 4
	// No. of Units: 16

// Sample Output:
	// ENROLLMENT SLIP
	// Student Name: Maria Blanco
	// Program/Course: Bachelor of Science in Information Technology
	// Year Name: Senior
	// No. of Units: 16
	// Tuition Fee: 36800
	// Down Payment: 11040
	// Balance: 25760

#include <iostream>
using namespace std;

int main() {
	// Student Name:
	string studentName;
	// Program/Course:
	string course;
	// Year Level: (should be integer type)
	short yearLevel;
	// Number of Units Enrolled: (should be double or float data type)
	double numberOfUnits;

	string yearName;
	float ratePerUnit;

	// Tuition fee = no. of units enrolled X rate per unit
	float tuitionFee;
	// Down payment = 30% of the tuition fee
	float downPayment;
	// Balance = tuition fee – down payment
	float balance;

	// Sample Input:
		// Student Name: Maria Blanco
		// Program/Course: Bachelor of Science in Information Technology
		// Year Level: 4
		// No. of Units: 16
	cout << "Student Name: ";
	cin >> studentName;
	cout << "Program/Course: ";
	cin >> course;
	cout << "Year Level: ";
	cin >> yearLevel;
	cout << "No. of Units: ";
	cin >> numberOfUnits;

	// Determine the corresponding year name of the student and rate per unit as follows:
		// Year Level	Year Name	Rate Per Unit
		// 1			Freshman	1,500
		// 2			Sophomore	1,800
		// 3			Junior 		2,000
		// 4 or 5		Senior		2,300
	switch (yearLevel) {
		case 1:
		yearName = "Freshman";
		ratePerUnit = 1500;
		break;
		case 2:
		yearName = "Sophomore";
		ratePerUnit = 1800;
		break;
		case 3:
		yearName = "Junior";
		ratePerUnit = 2000;
		break;
		case 4:
		yearName = "Senior";
		ratePerUnit = 2300;
		break;
		case 5:
		yearName = "Senior";
		ratePerUnit = 2300;
		break;
	}

	// Compute the tuition fee as follows:
		// Tuition fee = no. of units enrolled X rate per unit
		// Down payment = 30% of the tuition fee
		// Balance = tuition fee – down payment
	tuitionFee = numberOfUnits * ratePerUnit;
	downPayment = tuitionFee * 0.3;
	balance = tuitionFee - downPayment;

	// Sample Output:
		// ENROLLMENT SLIP
		// Student Name: Maria Blanco
		// Program/Course: Bachelor of Science in Information Technology
		// Year Name: Senior
		// No. of Units: 16
		// Tuition Fee: 36800
		// Down Payment: 11040
		// Balance: 25760

		cout << "ENROLLMENT SLIP" << endl;
		cout << "Student Name:" << studentName << endl;
		cout << "Program/Course: " << course << endl;
		cout << "Year Name: " << yearName << endl;
		cout << "No. of Units: " << numberOfUnits << endl;
		cout << "Tuition Fee: " << tuitionFee << endl;
		cout << "Down Payment: " << downPayment << endl;
		cout << "Balance: " << balance << endl;

	return EXIT_SUCCESS;
}