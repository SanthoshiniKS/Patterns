#include <stdio.h>
int main()
{
    int n,a=0,b=1;
    printf("Enter n:");
    scanf("%d",&n);
    if(n==1)
       printf("%d",a);
    else if(n==2)
       printf("%d",b);
    else{
        for(int i=3;i<=n;i++){
            int sum=a+b;
            a=b;
            b=sum;
        }
        printf("%d",b);
    }
    return 0;
}
