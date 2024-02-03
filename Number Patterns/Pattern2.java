import java.util.*;
public class Pattern
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter n: ");
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
Enter n: 6
1 
2 7 
3 8 12 
4 9 13 16 
5 10 14 17 19 
6 11 15 18 20 21 

*/
