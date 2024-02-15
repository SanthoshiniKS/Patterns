import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       String n=obj.next();
       System.out.println(isCool(n));
    }
    public static String isCool(String n){
        int sum=0;
        for(int i=0;i<n.length();i++){
            sum+=n.charAt(i)-'0';
        }
        for(int i=0;i<n.length();i++){
            for(int j=i+1;j<n.length();j++){
                if((n.charAt(i)-'0'+n.charAt(j)-'0')==(sum-(n.charAt(i)-'0'+n.charAt(j)-'0'))){
                    return "Cool";
                }
            }
        }
        return "Not Cool";
    }
}
