import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=obj.nextLine();
        System.out.println(reverse(s));
    }
    public static String reverse(String s){
        String res="";
        int j=s.length()-1;
        for(int i=0;i<s.length();i++){
            if(checkchar(s.charAt(i))){
                while(j>=0 && !checkchar(s.charAt(j))) {
                    j--;
                }
                res=res+s.charAt(j);
                j--;
            } 
            else
                res=res+s.charAt(i);
        }
        return res;
    }
    public static boolean checkchar(char c){
        if((c>='a' && c<='z') || (c>='A' && c<='Z') || (c-'0'>=0 && c-'0'<= 9))
            return true;
        return false;
    }
}

/*
Output:
Enter String: I% like to have tea
a% etev ah otek ilI

*/