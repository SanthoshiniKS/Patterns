import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String s=obj.next();
		int n=obj.nextInt();
		n=n%s.length();
		if(n==0){
		    System.out.println(s);
		}
		else{
		    System.out.println((s.substring(s.length()-n,s.length()))+(s.substring(0,s.length()-n)));
		}
	}
}


/*
Output:
cricket
10
ketcric

*/
