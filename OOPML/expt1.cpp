#include<iostream>
using namespace std;

int gcd(int a, int b){ 
  if (b == 0){
    return a;
  }
  else{
    return gcd(b, a % b);
  }
}

int lcm(int m, int n){
  return ((m*n)/gcd(m,n));
}

int gcd_iterative(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

int main(){
cout << "Enter 2 Numbers" << endl;
int a, b;
cin>>a>>b;
if(b>a){
  int temp = a;
  a = b;
  b = temp;
}
cout<<"The GCD is "<<gcd(a,b)<<endl;
cout<<"The GCD Iterative is "<<gcd_iterative(a,b)<<endl;
cout<<"The LCM is "<<lcm(a,b)<<endl;
  return 0;
}
