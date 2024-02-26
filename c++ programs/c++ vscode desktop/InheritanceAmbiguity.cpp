#include<iostream>
using namespace std;

class a{
public:
    void func(){
       cout<<"Hello"<<endl; 
    }
};

class b{
public:
    void func(){
        cout<<"World"<<endl;
    }
};

class c:public a,public b{};

int main(){
    c obj1;
    obj1.a::func();
    obj1.b::func();
    return 0;
}