#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int term1=0, term2=1;
  if(n==0)
    cout<<"0";
  else if(n==1)
    cout<<"1";
  else	{
  	for(int i=0; i<n-2; i++)	{
   	  int term3=term1+term2;
      term1=term2;
      term2=term3;
    }
    cout<<term2;
  }
}