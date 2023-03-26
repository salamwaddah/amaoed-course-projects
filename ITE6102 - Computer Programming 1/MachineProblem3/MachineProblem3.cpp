// Write a C++ program with the following specifications:
// 1.	Create a class and name it Payslip.  This class should have the following attributes or properties: name, pay grade, basic salary, overtime hours, overtime pay, gross pay, net pay and withholding tax.
// This class should also have the following methods: determinePayGradeAndTaxRate and computePay.
// 2.	Define the accessors and mutators of the Payslip class based on its attributes or properties.
// 3.	Input the employee name, basic salary, and number of overtime (OT) hours.  Apply validations for input as follows:
// a.	Basic salary should not be less than 10,000.
// b.	Minimum overtime hours is 1 hour.
// 4.	Basic Salary Details:
// Pay Grade A	Pay Grade B	Tax Rate
// 10,000	15,000	10%
// 20,000	25,000	15%
// 30,000	35,000	20%
// 40,000	45,000	25%
// 50,000	55,000	30%

// 5.	The computation is as follows:
// Gross pay = basic salary + OT pay
// OT pay = no. of OT hours * 1% of basic salary
// Net pay = gross pay – withholding tax – fixed values
// Withholding tax = gross pay * tax rate
// Note: Basic salary greater than 55,000 will have a pay grade of B and a tax rate of 30%.

// 6.	The following are fixed values:
// SSS = 500.00
// Pag-ibig = 200.00
// Philhealth = 100.00

// 7.	Output should contain the following:
// Employee Name  	:
// Basic Salary		:
// Pay Grade		:
// No. of OT Hours	:
// OT Pay		:
// Gross Pay		:
// Withholding Tax	:
// Net Pay		:

// Note: Input of data and display of results should be defined on the main method.
// All monetary display should be formatted with comma separators, 2 decimal places, and “Php” (Ex: Php 32,546.95).

#include <string>
#include <iostream>
#include "Payslip.h"


using namespace std;

int main()
{
	string name;
	float basicSalary;
	int overtimeHours;

	cout << "Input employee name: ";
	cin >> name;

	cout << "Input basic salary: ";
	cin >> basicSalary;

	if (basicSalary < 10000)
	{
		cout << "Basic salary must not be less than 10,000" << endl;
		return EXIT_FAILURE;
	}

	cout << "Input number of overtime hours: ";
	cin >> overtimeHours;

	if (overtimeHours < 1)
	{
		cout << "Overtime hours should be at least 1 hour" << endl;
		return EXIT_FAILURE;
	}

	Payslip slip(name, basicSalary, overtimeHours);

	cout << slip.computePay() << endl;

	return EXIT_SUCCESS;
}
