#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int num=n;
  int sum=0;
  while(n){
    sum+=n%10;
    n/=10;
  }
  if(num%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}