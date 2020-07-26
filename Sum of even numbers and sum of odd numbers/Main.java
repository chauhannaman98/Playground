#include<iostream>
using namespace std;
int main()
{
  int arr[15], n, sum_even=0, sum_odd=0;
  cin>>n;
  for(int i=0; i<n; i++)	{
    cin>>arr[i];
    if(arr[i]%2==0)	{
   	  // even
      sum_even+=arr[i];
    }
   	else	{
      // odd
      sum_odd+=arr[i];
    }
  }
  cout<<"The sum of the even numbers in the array is "<<sum_even<<endl;
  cout<<"The sum of the odd numbers in the array is "<<sum_odd;
}