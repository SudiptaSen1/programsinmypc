#include<stdio.h>
#define MAX 200

char arr[MAX];
int top=-1;

void push(){
    if(top==MAX-1){
        printf("Stack is full");
        return;
    }
    printf("Enter the expression :-");
    char exp[20];
    gets(exp);
    char c;
    int i=0;
    while(exp[i]!='\0'){
        c=exp[i];
        top++;
        arr[top]=c;
        i++;
    }
}
void pop(){
    if(top==-1){
        printf("Stack is Empty");
        return;
    }
     printf("element poped = %c\n",arr[top]);
    top--;
}
char peek(){
    return arr[top];
}
void parenthesis(){
    int startcount=0,endcount=0;
    while(top!=-1){
        if(peek()=='('||peek()=='{'||peek()=='['){
            startcount++;
            pop();
        }
        else if(peek()==')'||peek()=='}'||peek()==']'){
            endcount++;
            pop();
        }else{
            pop();
        }
    }
    if(startcount==endcount){
        printf("Brackets are complete \n");
    }else{
        printf("Brackets are incomplete \n");
    }
}
int main(){
    push();
    parenthesis();
    return 0;
}