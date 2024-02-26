#include<iostream>
using namespace std;

class Complex{
public:
    int real;
    int imaginary;
public:
    Complex(){
        real=0;
        imaginary-0;
    }
    Complex(int x,int y){
        real=x;
        imaginary=y;
    }
    Complex operator+(Complex& c){
        Complex ans;
        ans.real=real+c.real;
        ans.imaginary=imaginary+c.imaginary;
        return ans;
    }
};

int main(){
    Complex c1(1,2);
    Complex c2(1,3);
    Complex c3=c1+c2;
    cout<<c3.real<<" i"<<c3.imaginary<<endl;
    return 0;
}