#include <iostream>
#include <cmath>
using namespace std;

double test_num(int a, int b){
	int sum=a+b;
	int sub=a-b;
	int mul=a*b;
	double div=(double)a/b;
	
	cout<<"\nThe relationship between A and B : "<<endl;
	cout<<"Addtion : \t\t"<<sum
	<<"\nSubtraction : \t\t"<<sub
	<<"\nMultiplication : \t"<<mul
	<<"\nDivision : \t\t"<<div<<endl;
	
	return 1;
}

int main(){
	int a, b;
	double c;
	
	cout<<"To find the relationship between A and B"<<endl;
	cout<<"Enter a number for A : ";
	cin>>a;
	cout<<"Enter a number for B : ";
	cin>>b;
	
	test_num(a,b);

	cout<<"\nTo find the number after square root\nEnter a number : ";
	cin>>c;
	cout<<"Square root of "<<c<<" is "<<sqrt(c)<<endl;
		
	return 0;
}
