import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n1=obj.nextInt();
		int n2=obj.nextInt();
		int A[]=new int[n1];
		int B[]=new int[n2];
		for(int i=0;i<n1;i++){
		    A[i]=obj.nextInt();
		}
		for(int i=0;i<n2;i++){
		    B[i]=obj.nextInt();
		}
		System.out.println(Arrays.toString(FindDifference(A,B)));
	}
	public static long[] FindDifference(int A[],int B[]){
	    long a=0,b=0;
	    for(int i=0;i<A.length;i++){
	        a=a*10+A[i];
	    }
	    for(int i=0;i<B.length;i++){
	        b=b*10+B[i];
	    }
	    long c=a-b;
	    long temp=c;
	    int n=0;
	    while(temp>0){
	        temp=temp/10;
	        n++;
	    }
	    long C[]=new long[n];
	    for(int i=n-1;i>=0;i--){
	        long rem=c%10;
	        C[i]=rem;
	        c=c/10;
	    }
	    return C;
	}
}
/*
Output:
5
4
1 2 7 0 5
9 1 9 9
[3, 5, 0, 6]
*/
