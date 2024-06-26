import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n1=obj.nextInt();
		int A[]=new int[n1];
		for(int i=0;i<n1;i++){
		    A[i]=obj.nextInt();
		}
		System.out.println(Median(A));
	}
	public static double Median(int arr[]){
	   double median=0;
	   int m=0;
	   if(arr.length%2==0){
	       m=arr.length/2;
	       median=(arr[m-1]+arr[m])/2.0;
	   }
	   else{
	       m=(arr.length/2);
	       median=arr[m];
	   }
	   return median;
	}
}
/*
Output:
5
1 2 3 4 5
3.0
*/
