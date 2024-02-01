import java.util.*;
class Pattern {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(2*n)-1;j++){
                if(j>=i && (i+j)<=2*n){
                    if((i+j)%2==0)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            else
                System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int k=1;k<=(2*n)-1;k++){
                if(k>=i && (i+k)<=2*n){
                    if((i+k)%2==0)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
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
      *   *       
    *   *   *     
  *   *   *   *   
*   *   *   *   * 
  *   *   *   *   
    *   *   *     
      *   *       
        *         

*/
