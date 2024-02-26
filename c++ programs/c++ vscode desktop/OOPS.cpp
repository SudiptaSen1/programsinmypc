#include<iostream>
using namespace std;

class Fruit{
private:
    string name;
    string color;
    double calories;
public:
    Fruit(){
        name="";
        color="";
        calories=0.0;
    }
    Fruit(string name,string color,double calories){
        this->name=name;
        this->color=color;
        this->calories=calories;
    }
    // Fruit operator=(Fruit& obj){
    //     name=obj.name;
    //     color=obj.color;
    //     calories=obj.calories;
    // }
    // Fruit operator=(Fruit& obj){
    //     // name=obj.name;
    //     // color=obj.color;
    //     // calories=obj.calories;
    //     Fruit(obj.name,obj.color,obj.calories);
    // }
    Fruit operator=(Fruit& obj){
        Fruit ans;
        ans.name=obj.name;
        ans.color=obj.color;
        ans.calories=obj.calories;
        return ans;
    }
    ~Fruit(){
        cout<<"Destroying your object"<<endl;
    }
    string getName(){
        return name;
    }
    string getColor(){
        return color;
    }
    double getCalories(){
        return calories;
    }
    string setName(string name){
        this->name=name;
    }
    string setColor(string color){
        this->color=color;
    }
    double setCalories(double calories){
        this->calories=calories;
    }
    void print(){
        cout<<"Name = "<<this->name<<endl<<"Color ="<<this->color<<endl<<"Calories present = "<<this->calories<<endl;
    }
};

int main(){
    Fruit *mango=new Fruit("Mango","Yellow",100.00);
    mango->setName("Alphanso Mango");
    mango->print();
    delete mango;
    Fruit orange("Orange","Orange",150.00);
    orange.print();
    Fruit mousambi=orange;
    mousambi.print();
    mousambi.setName("Mousambi");
    mousambi.setColor("Green");
    mousambi.setCalories(150.00);
    return 0;
}