#include<iostream>
using namespace std;
int main()
{
  //input
  int principal, rate, time;
  //output
  float interest,amt, disc, fs;
  cin>>principal>>rate>>time;
  interest=principal*time*rate/100;
  amt = principal+interest;
  disc = (0.02)*interest;
  fs = amt-disc;
  cout<<interest;
  cout<<"\n"<<amt;
  cout<<"\n"<<disc;
  cout<<"\n"<<fs;
}