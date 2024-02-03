import java.util.*;
class Pattern {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=obj.nextInt();
        pattern(n);
    }
    public static void pattern(int n){
        for(int i=1;i<=(2*n)-1;i++){
            int k=i<=n?i:(2*n)-i;
            for(int j=1;j<=n-k+1;j++){
                   System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Output:
Enter n: 
6
******
*****
****
***
**
*
**
***
****
*****
******

*/
