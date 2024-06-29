import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=obj.nextInt();
		}
		SubSeq(arr,n);
	}
	public static void SubSeq(int arr[],int n){
	    List<List<Integer>> seq=new ArrayList<>();
	    for(int i=1;i<(1<<n);i++){
	        List<Integer> temp=new ArrayList<>();
	        for(int j=0;j<n;j++){
	            if((i&(1<<j))!=0){
	                temp.add(arr[j]);
	            }
	        }
	        seq.add(temp);
	    }
	    System.out.println(seq);
	}
}
/*
Output:
4
1 5 3 6
[[1], [5], [1, 5], [3], [1, 3], [5, 3], [1, 5, 3], [6], [1, 6], [5, 6], [1, 5, 6], [3, 6], [1, 3, 6], [5, 3, 6], [1, 5, 3, 6]]
*/
