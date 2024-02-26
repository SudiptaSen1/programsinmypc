#include<stdio.h>
#include<math.h>

double f(int x){
    return x;
}

int main(){
    double a,b,h,ans=0.0,s=0.0;
    int n,i;
    printf("Enter the upper bound b:-\n");
    scanf("%lf",&b);
    printf("Enter the upper bound a:-\n");
    scanf("%lf",&a);
    printf("Enter the number of terms:-\n");
    scanf("%d",&n);
    h=(b-a)/n;
    for(i=1;i<n-1;i=i+2){
        s=s+4*f(a+i*h);
    }
    for(i=2;i<n-2;i=i+2){
        s=s+2*f(a+i*h);
    }
    ans=(h/3.0)*(f(a)+f(b)+s);
    printf("Answer = %lf",ans);
    return 0;
}