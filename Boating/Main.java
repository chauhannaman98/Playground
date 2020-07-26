#include<iostream>
#define adult_w 75
#define child_w 30
using namespace std;
int main()	{
  int total_w, num_adults, num_children;
  cin>>total_w>>num_adults>>num_children;
  int w = adult_w*num_adults + child_w*num_children;
  if(w<total_w)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}