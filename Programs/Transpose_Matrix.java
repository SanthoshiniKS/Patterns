import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++)
		      arr[i][j]=obj.nextInt();
		}
		transpose(arr);
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
	}
	public static void transpose(int arr[][]){
	    for(int i=0;i<arr.length;i++){
	        for(int j=i+1;j<arr[i].length;j++){
	            int temp=arr[i][j];
	            arr[i][j]=arr[j][i];
	            arr[j][i]=temp;
	        }
	    }
	}
}
