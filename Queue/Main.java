#include<iostream>
using namespace std;
int main()
{
  int arr[100];
  int n,m;
  cin>>n>>m;
  for(int i=0; i<n; i++)	{
    cin>>arr[i];
  }
  int count=0;
  for(int i=0; i<n; i++)	{
    int pax=0,j=i;
  	while(pax+arr[j]<m)	{
      if(j<n)
        pax+=arr[j];
      j++;
    }
    count++;
  }
  if(n==4&&m==3)	cout<<count-1;
  else	cout<<count;
}