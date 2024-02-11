import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter String 1:");
        String s1=obj.next();
        System.out.println("Enter String 2:");
        String s2=obj.next();
        if(s1.charAt(s1.length()-1)==s2.charAt(0))
           s1=s1.substring(0,s1.length()-1)+s2;
        else
           s1=s1+s2;
        System.out.print(s1);
    }
}
