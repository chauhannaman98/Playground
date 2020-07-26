#include<iostream>
using namespace std;
int main()
{
  int arr[100][100];
  int n, m;
  cin>>n>>m;
  int chances=n+m;
  int points=n*m;
  bool arun_win = false;
  for(int i=0; i<n; i++)	{
    for(int j=0; j<m; j++)	{
      arr[i][j]=1;
    }
  }
  for(int k=0; k<n; k++)	{
    for(int l=0; l<m; l++)	{
    	if(arr[k][l]==1){
        	arun_win=!arun_win;
        }
    }
  }
  if(n==1)	{
    cout<<"Arun Gupta";
  }
  else	{
  if(arun_win)
    cout<<"Arun Gupta";
  else
    cout<<"Mani Iyer";
  }
}