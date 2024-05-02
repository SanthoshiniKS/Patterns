/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

void BubbleSort(int arr[],int n){
    int didSwap=0;
    for(int i=n-1;i>=0;i--){
        for(int j=0;j<i;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                didSwap=1;
            }
        }
        if(didSwap==0){
            break;
        }
    }
}

int main()
{
    int n=0;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    BubbleSort(arr,n);
    printf("\nSorted Array: ");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}
/*
Output:
5
12 43 22 10 43

Sorted Array: 10 12 22 43 43
*/
