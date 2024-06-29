import java.util.*;
public class SubArray
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=obj.nextInt();
		}
		System.out.println(subArray(arr,n));
	}
	public static List<List<Integer>> subArray(int arr[],int n){
	    List<List<Integer>> subarray=new ArrayList<>();
	    for(int i=0;i<n;i++){
	        for(int j=i;j<n;j++){
	            List<Integer> temp=new ArrayList<>();
	            for(int k=i;k<=j;k++){
	                temp.add(arr[k]);
	            }
	            subarray.add(temp);
	        }
	    }
	    return subarray;
	}
}
/*
Output:
4
1 2 3 4
[[1], [1, 2], [1, 2, 3], [1, 2, 3, 4], [2], [2, 3], [2, 3, 4], [3], [3, 4], [4]]
*/
