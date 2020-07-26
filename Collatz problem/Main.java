#include<iostream>
using namespace std;
int main()
{
  int count=0, n;
  cin>>n;
  cout<<n<<endl;
  while(n!=1)	{
  	if(n%2)	{	//odd
 		n=3*n+1;
  	}
  	else	{	//even
    	n=n/2;
    }
    cout<<n<<endl;
    count++;
  }
  cout<<count;
}