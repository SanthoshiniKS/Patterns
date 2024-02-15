import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	    int n1=obj.nextInt();
	    int n2=obj.nextInt();
	    int A[]=new int[n1];
	    int B[]=new int[n2];
	    for(int i=0;i<n1;i++)
	        A[i]=obj.nextInt();
	    for(int i=0;i<n2;i++)
	        B[i]=obj.nextInt();
	    System.out.println(difference(A,B));
   }
   public static int difference(int A[],int B[]){
       int a=0,b=0;
	   for(int i=0;i<A.length;i++){
	        a=a*10+A[i];
	   }
	   for(int i=0;i<B.length;i++){
	        b=b*10+B[i];
	   }
	   return Math.abs(b-a);
   }
}
