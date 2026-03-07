#include <iostream>
using namespace std;

double test_num(int a, int b){
	int sum=a+b;
	int sub=a-b;
	int mul=a*b;
	double div=(double)a/b;
	
	cout<<"\nThe relationship for A and B : "<<endl;
	cout<<"Addtion : \t\t"<<sum
	<<"\nSubtraction : \t\t"<<sub
	<<"\nMultiplication : \t"<<mul
	<<"\nDivision : \t\t"<<div<<endl;
	
	return 1;
}

int main(){
	int a, b;
	
	cout<<"Hello World!"<<endl;
	cout<<"Enter a number for A : ";
	cin>>a;
	cout<<"Enter a number for B : ";
	cin>>b;
	
//	int sum=a+b;
//	int sub=a-b;
//	int mul=a*b;
//	int div=a/b;
	
	test_num(a,b);
	
//	cout<<"\nThe relationship for A and B : "<<endl;
//	cout<<"Addtion : "<<sum<<"\nSubtraction : "<<sub<<"\nMultiplication : "<<mul<<"\nDivision : "<<div<<endl;
	
	return 0;
}
