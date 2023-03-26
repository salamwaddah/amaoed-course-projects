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
#include <sstream>
#include <iostream>
#include <iomanip>

using namespace std;

class Payslip
{
private:
	string name;
	char payGrade;
	float basicSalary;
	int overtimeHours;
	float grossPay;
	float netPay;
	float withholdingTax;
	float taxRate;

public:
	// Constructor
	Payslip(string name, float basicSalary, int overtimeHours);

	// Mutators
	void setEmployeeName(string employeeName);
	void setPayGrade(char payGrade);
	void setBasicSalary(float basicSalary);
	void setOvertimeHours(int overtimeHours);
	void setNetPay(float netPay);
	void setWithholdingTax(float withholdingTax);
	void setTaxRate(float taxRate);

	// Accessors
	string getEmployeeName();
	char getPayGrade();
	float getBasicSalary();
	int getOvertimeHours();
	float getNetPay();
	float getWithholdingTax();
	float getTaxRate();

	// Methods
	void determinePayGradeAndTaxRate();
	string computePay();
};

Payslip::Payslip(string name, float basicSalary, int overtimeHours)
{
	this->setEmployeeName(name);
	this->setBasicSalary(basicSalary);
	this->setOvertimeHours(overtimeHours);
	this->determinePayGradeAndTaxRate();
}

void Payslip::setEmployeeName(string name)
{
	this->name = name;
}

void Payslip::setPayGrade(char payGrade)
{
	this->payGrade = payGrade;
}

void Payslip::setBasicSalary(float basicSalary)
{
	this->basicSalary = basicSalary;
}

void Payslip::setOvertimeHours(int overtimeHours)
{
	this->overtimeHours = overtimeHours;
}

void Payslip::setNetPay(float netPay)
{
	this->netPay = netPay;
}
void Payslip::setWithholdingTax(float withholdingTax)
{
	this->withholdingTax = withholdingTax;
}

void Payslip::setTaxRate(float taxRate)
{
	this->taxRate = taxRate;
}

string Payslip::getEmployeeName()
{
	return this->name;
}

char Payslip::getPayGrade()
{
	return this->payGrade;
}

float Payslip::getBasicSalary()
{
	return this->basicSalary;
}

int Payslip::getOvertimeHours()
{
	return this->overtimeHours;
}

float Payslip::getNetPay()
{
	return this->netPay;
}
float Payslip::getWithholdingTax()
{
	return this->withholdingTax;
}

float Payslip::getTaxRate()
{
	return this->taxRate * 0.01;
}

void Payslip::determinePayGradeAndTaxRate()
{
	// Pay Grade A	Pay Grade B	Tax Rate
	// 10,000	15,000	10%
	// 20,000	25,000	15%
	// 30,000	35,000	20%
	// 40,000	45,000	25%
	// 50,000	55,000	30%

	int pay[10] = {10000, 15000, 20000, 25000, 30000, 35000, 40000, 45000, 50000, 55000};
	char grades[10] = {'A', 'B', 'A', 'B', 'A', 'B', 'A', 'B', 'A', 'B'};
	int taxRates[10] = {10, 10, 15, 15, 20, 20, 25, 25, 30, 30};

	for (int i = 0; i < 10; i++)
	{
		if (this->getBasicSalary() > 55000)
		{
			this->setTaxRate(30);
			this->setPayGrade('B');
			break;
		}

		if (this->getBasicSalary() < pay[i])
		{
			int index = i - 1;
			this->setTaxRate(taxRates[i - 1]);
			this->setPayGrade(grades[i - 1]);
			break;
		}
	}
}

string Payslip::computePay()
{
	// OT pay = no. of OT hours * 1% of basic salary
	float otPay = this->getOvertimeHours() * (0.01 * this->getBasicSalary());

	// Gross pay = basic salary + OT pay
	float grossPay = this->getBasicSalary() + otPay;

	float SSS = 500.00;
	float Pagibig = 200.00;
	float Philhealth = 100.00;
	float fixedValues = SSS + Pagibig + Philhealth;

	// Withholding tax = gross pay * tax rate
	float withholdingTax = grossPay * this->getTaxRate();
	this->setWithholdingTax(withholdingTax);

	// Net pay = gross pay – withholding tax – fixed values
	float netPay = grossPay - this->getWithholdingTax() - fixedValues;

	ostringstream s;

	s.imbue(locale(""));
	s << setprecision(2) << fixed << endl;

	// cout << "Php "<< amount << endl;

	s << "Employee Name		: " << this->getEmployeeName() << endl;
	s << "Basic Salary		: " << "Php " << this->getBasicSalary() << endl;
	s << "Pay Grade		: " << this->getPayGrade() << endl;
	s << "No. of OT Hours		: " << this->getOvertimeHours() << endl;
	s << "OT Pay			: " << "Php " << otPay << endl;
	s << "Gross Pay		: " << "Php " << grossPay << endl;
	s << "Withholding Tax		: " << "Php " << this->getWithholdingTax() << endl;
	s << "Net Pay			: " << "Php " << netPay << endl;

	return s.str();
}
