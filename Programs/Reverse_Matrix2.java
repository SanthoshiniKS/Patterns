import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int m=obj.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++)
		      arr[i][j]=obj.nextInt();
		}
		reverse(arr);
	}
	public static void reverse(int arr[][]){
        for (int i=0;i<arr.length/2;i++) {
            int temp[]=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][arr[i].length-j-1];
                arr[i][arr[i].length-j-1]=temp;
            }
        }
        System.out.println("Reversed Matrix: ");
        for(int i=0;i<arr.length;i++){
		    for(int j=0;j<arr[0].length;j++){
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
