#include <string>
#include <sstream>

using namespace std;

class Subject
{
private:
	string mTitle, mCode;
	short mUnits;

public:
	Subject(string title, string code, short units)
	{
		mTitle = title;
		mCode = code;
		mUnits = units;
	}

	string getSubject()
	{
		ostringstream s;
		s << "[" << mCode << "] " << mTitle;
		s << " (" << mUnits << " units)";
		return s.str();
	}
};
