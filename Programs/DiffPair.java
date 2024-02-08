import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		    arr[i]=obj.nextInt();
		System.out.println("Enter Target: ");
		int t=obj.nextInt();
		diffpair(arr,t);
	}
	public static void diffpair(int arr[],int t){
	    ArrayList<ArrayList<Integer>> a=new ArrayList<>();
		for(int i=0;i<arr.length;i++){
		    for(int j=i+1;j<arr.length;j++){
		        if(Math.abs(arr[i]-arr[j])==t){
		            ArrayList<Integer> temp=new ArrayList<>();
		            temp.add(arr[i]);
		            temp.add(arr[j]);
		            a.add(temp);
		        }
		    }
		}
		System.out.println(a);
	}
}

/*
Output:
5
1 3 6 8 9
Enter Target: 
5
[[1, 6], [3, 8]]

*/
