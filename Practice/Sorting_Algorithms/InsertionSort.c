/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

void InsertionSort(int arr[],int n){
    int j=0;
    for(int i=0;i<n;i++){
        j=i;
        while(j>0 && arr[j]<arr[j-1]){
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
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
    InsertionSort(arr,n);
    printf("\nSorted Array: ");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}

/*
Output:
7
14 9 15 12 6 8 13

Sorted Array: 6 8 9 12 13 14 15
*/
