#include<iostream>
using namespace std;
int main()
{
  int n,s;
  cin>>n>>s;
  int arr[100];
  int sum=0;
  for(int i=0; i<n; i++)	{
    cin>>arr[i];
    sum+=arr[i];
  }
  if(sum<=s)
    cout<<"YES";
  else
    cout<<"NO";
}