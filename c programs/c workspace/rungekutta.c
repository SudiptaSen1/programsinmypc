#include<stdio.h>
#include<math.h>

double f(int x,int y){
    return ((x*y+1)/(10*y*y+4));
}

int main(){
    double x0,y0,yn,xn,h,k1,k2,k3,k4;
    int n,i;
    printf("Enter the value of x0:-");
    scanf("%lf",&x0);
    printf("Enter the value of xn:-");
    scanf("%lf",&xn);
    printf("Enter the value of y0:-");
    scanf("%lf",&y0);
    printf("Enter the value of h:-");
    scanf("%lf",&h);
    n=(xn-x0)/h;
    yn=y0;
    double x=x0;
    for(i=0;i<n;i++){
        k1=h*f(x,yn);
        k2=h*f((x+h/2.0),(yn+k1/2.0));
        k3=h*f((x+h/2.0),(yn+k2/2.0));
        k4=h*f((x+h),(yn+k3));
        x=x+h;
        yn=yn+((k1+2*k2+2*k3+k4)/6.0);
    }
    printf("Answer = %lf",yn);
    return 0;
}