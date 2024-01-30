import java.util.*;
class Pattern {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j>n-i)
                   System.out.print("* ");
                else
                   System.out.print("  ");
            }
            System.out.println();
        }
    }
}
/*
Output:
5
        * 
      * * 
    * * * 
  * * * * 
* * * * * 

*/
