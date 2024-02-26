#include <stdio.h>
#define MAX 200
int smallest(int arr[],int n,int i){
    int pos=i,small=arr[i],k;
    for(k=i+1;k<n;k++){
        if(small>arr[k]){
            small=arr[k];
            pos=k;
        }
    }
    return pos;
}
void selection_sort(int arr[],int n){
    int pos,temp,i;
    for(i=0;i<n;i++){
        pos=smallest(arr,n,i);
        temp=arr[i];
        arr[i]=arr[pos];
        arr[pos]=temp;
    }
}
void insertion_sort(int arr[],int n){
    int i,j;
    int temp;
    for(i=1;i<n;i++){
        temp=arr[i];
        j=i-1;
        while((temp<arr[j])&&(j>=0)){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
    }
}
int linear_search(int arr[],int n,int search){
    for(int i=0;i<n;i++){
        if(search==arr[i]){
            return i+1;
        }
    }
    return -1;
}
void bubble_sort_optimized(int arr[],int n){
    int flag=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                flag=1;
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        if(flag==0){
            break;
        }
    }
}
void bubble_sort(int arr[],int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}
int binary_search(int arr[],int n,int search){
    int beg=0;
    int end=n-1;
    int middle=0;
    while(beg<=end){
        middle=(beg+end)/2;
        if(search==arr[middle]){
            return middle+1;
        }else if(search<arr[middle]){
            end=middle-1;
        }else{
            beg=middle+1;
        }
    }
    return -1;
}
int interpolation_search(int arr[],int n,int search){
    int beg=0;
    int end=n-1;
    int middle=0;
    while(beg<=end){
        middle=beg+((beg-end)*(search-arr[end]))/(arr[end]-arr[beg]);
        if(search==arr[middle]){
            return middle+1;
        }else if(search<arr[middle]){
            end=middle-1;
        }else{
            beg=middle+1;
        }
    }
    return -1;
}
int main() {
    int arr[MAX],n;
    printf("Enter the number of elemnets n<MAX:-\n");
    scanf("%d",&n);
    printf("Enter the array elements:-\n");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    // selection_sort(arr,n);
    // insertion_sort(arr,n);
    // bubble_sort(arr,n);
    // printf("The sorted array is:-\n");
    // for(int i=0;i<n;i++){
    //     printf("%d\n",arr[i]);
    // }
    // printf("\n");
    int pos=interpolation_search(arr,n,3);
    printf("%d",pos);
    return 0;
}