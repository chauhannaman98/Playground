#include<iostream>
using namespace std;
int main()	{
  int max_w, w;
  cin>>max_w>>w;
  if(w>max_w)
    cout<<"Sorry, you can't enter";
  else if(w==max_w)
    cout<<"Yes, you can enter. Kindly use a rope.";
  else
    cout<<"Yes, you can enter.";
}