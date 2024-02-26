#include<iostream>
using namespace std;

class Sum{
public:
    void Add(int x,int y){
        int sum = x+y;
        cout<<sum<<endl;
    }
    void Add(int x,int y,int z){
        int sum=x+y+z;
        cout<<sum<<endl;
    }
    void Add(float x,float y){
        float sum=x+y;
        cout<<sum<<endl;
    }
};

int main(){
    Sum s;
    s.Add(2,3);
    s.Add(2,3,4);
    s.Add(float(2.3),float(2.7));
    return 0;
}