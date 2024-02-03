import java.util.*;
class Pattern {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=obj.nextInt();
        pattern(n);
    }
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0)
                   System.out.print("1 ");
                else
                   System.out.print("0 ");
            }
            System.out.println();
        }

    }
}
/*
Output:
Enter n: 
5
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 

*/
