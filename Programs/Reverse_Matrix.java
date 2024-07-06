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
		reverse(arr);
	}
	public static void reverse(int arr[][]){
	    int n=arr.length;
        int m=arr[0].length;
        int[][] reversedMatrix=new int[n][m];
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr[0].length;j++) {
                reversedMatrix[i][j]=arr[n-1-i][m-1 -j];
            }
        }
        for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        System.out.print(reversedMatrix[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
