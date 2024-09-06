package javaapplication1;
import java.util.*;
public class BinToDecimal {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        System.out.println(binaryToDecimal(n));
    }
    public static int binaryToDecimal(int n){
        int ans=0,i=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            ans+=rem*Math.pow(2,i);
            i++;
        }
        return ans;
    }
}
