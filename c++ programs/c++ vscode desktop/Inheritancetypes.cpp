#include<iostream>
using namespace std;

class Parent1{
public:
    Parent1(){
        cout<<"Parent1 Class"<<endl;
    }
};

class Parent2{
public:
    Parent2(){
        cout<<"Parent2 Class"<<endl;
    }
};

class Child1:public Parent1{//hierachical inheritance
public:
    Child1(){
        cout<<"Child1 class"<<endl;
    }
};

class Child2:public Parent1,public Parent2{//multiple inheritance
public:
    Child2(){
        cout<<"Child2 class"<<endl;
    }
};

class Child3:public Parent1{//hierachical inheritance
public:
    Child3(){
        cout<<"Child3 class"<<endl;
    }
};

class GrandChild:public Child1{//multilevel inheritance //hybrid inheritance
public:
    GrandChild(){
        cout<<"Grandchild class"<<endl;
    }
};

int main(){
    // Child2 c;
    // GrandChild gc;
    return 0;
}