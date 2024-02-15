import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) 
            arr[i]=obj.nextInt();
        int min=arr[0]*arr[1]*arr[2];
        int a=0,b=0,c=0;
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j<n-1;j++){
                int product=arr[i]*arr[j]*arr[j+1];
                if(product<min) {
                    min=product;
                    a=i;
                    b=j;
                    c=j+1;
                }
            }
        }
        System.out.println(arr[a]+" "+arr[b]+" "+arr[c]);
    }
}
/*
Output:
5
1 2 -4 -5 -9
-4 -5 -9
*/
