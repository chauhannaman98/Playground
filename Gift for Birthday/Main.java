#include <iostream> 
using namespace std; 

bool checkYear(int year) 
{ 
	
	// Return true if year is a multiple 
	// 0f 4 and not multiple of 100. 
	// OR year is multiple of 400. 
	return (((year % 4 == 0) && (year % 100 != 0)) || 
			(year % 400 == 0)); 
} 

int main() 
{ 
	int year;
  	cin>>year;

	checkYear(year)? cout << year<<" is a leap year":cout << year<<" is not a leap year"; 
	return 0; 
}