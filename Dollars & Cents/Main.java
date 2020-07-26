#include<iostream>
using namespace std;
int main()
{
  int dollar1, cent1, dollar2, cent2;
  cin>>dollar1>>cent1>>dollar2>>cent2;
  int total_dollar = dollar1+dollar2;
  int total_cent = cent1+cent2;
  //cout<<"total dollar = "<<total_dollar<<endl;
  //cout<<"total cent = "<<total_cent<<endl;
  int carry;
  if(total_cent>99)	{
    ++total_dollar;
  	carry = (total_cent-100);
    total_cent-=100;
    //cout<<"carry = "<<carry<<endl;
  }
  cout<<total_dollar<<endl;
  cout<<total_cent;
}