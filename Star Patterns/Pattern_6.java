import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		for(int i=1;i<=n;i++){
		    int temp=i;
		    for(int j=1;j<=i;j++){
		        System.out.print(temp+" ");
		        temp=temp+n-j;
		    }
		    System.out.println();
		}
	}
}

/*
Output:
5
1 
2 6 
3 7 10 
4 8 11 13 
5 9 12 14 15 

*/
