#include <stdio.h>
void SelectionSort(int arr[],int n){
    for(int i=0;i<n-1;i++){
        int min=i;
        for(int j=i;j<n;j++){
            if(arr[j]<arr[min]){
                min=j;
            }
        }
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
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
    SelectionSort(arr,n);
    printf("\nSorted Array: ");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}


/*
Output:
6
13 46 24 52 20 9

Sorted Array: 9 13 20 24 46 52
*/
