import java.util.*;
class Pattern {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=1;j--){
                if(j>=i)
                   System.out.print("  ");
                else
                   System.out.print(j+" ");
            }
            for(int k=0;k<i;k++)
                System.out.print(k+" ");
            System.out.println();
        }
    }
}
