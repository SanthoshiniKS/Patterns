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
            for(int j=1;j<=(2*n)-i;j++){
                if((i+j)<=n)
                   System.out.print(" ");
                else
                   System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Output:
Enter n: 
4
   ****
  ****
 ****
****

*/
