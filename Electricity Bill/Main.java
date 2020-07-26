#include<iostream>
using namespace std;
int main()
{
  int units, amt, extra=0;
  float rate;
  cin>>units;
  if(units<=200)	{
    rate = 0.5;
  }
  else if(units<=400)	{
    rate = 0.65;
    extra = 100;
  }
  else if(units<=600)	{
    rate = 0.80;
    extra = 200;
  }
  else if(units>600)	{
    rate = 1.25;
    extra = 425;
  }
  amt = units*rate+extra;
  cout<<"Rs."<<amt;
}