import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String s1=obj.next();
		String s2=obj.next();
		if(s1.compareTo(s2)>0){
		    System.out.println(s2+s1);
		}
		else{
		    System.out.println(s1+s2);
		}
	}
}

/*
Output:
apple
orange
appleorange
*/
