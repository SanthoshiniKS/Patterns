import java.util.*;
class Pattern {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        System.out.print(sum);
    }
}
/*
Output:
96433
25
*/
