import java.util.*;
public class Subsequence
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=obj.nextInt();
		}
		System.out.println(subSeq(arr,n));
	}
	public static List<List<Integer>> subSeq(int arr[],int n){
	    List<List<Integer>> seq=new ArrayList<>();
	    for(int i=1;i<(1<<n);i++){
	        List<Integer> temp=new ArrayList<>();
	        for(int j=0;j<n;j++){
	            if((i & (1<<j))!=0){
	                temp.add(arr[j]);
	            }
	        }
	        seq.add(temp);
	    }
	    return seq;
	}
}
/*
Output:
3
1 2 3
[[1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
*/
