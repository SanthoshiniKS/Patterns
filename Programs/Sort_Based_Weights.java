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
	    ArrayList<Integer> thr=new ArrayList<>();
		ArrayList<Integer> four=new ArrayList<>();
		ArrayList<Integer> five=new ArrayList<>();
		for(int i=0;i<n;i++){
		    int temp=(int)Math.sqrt(arr[i]);
		    if((temp*temp)==arr[i]){
		        five.add(arr[i]);
		    }
		    else if(arr[i]%4==0 && arr[i]%6==0){
		        four.add(arr[i]);
		    }
		    else if(arr[i]%2==0){
		        thr.add(arr[i]);
		    }
		}
		Collections.sort(thr,Collections.reverseOrder());
		Collections.sort(four,Collections.reverseOrder());
		Collections.sort(five,Collections.reverseOrder());
		System.out.println(five+" "+four+" "+thr);
		for(int i=0;i<five.size();i++){
		    System.out.print("<"+five.get(i)+",5>");
		}  
		for(int i=0;i<four.size();i++){
		    System.out.print("<"+four.get(i)+",4>");
		}
		for(int i=0;i<thr.size();i++){
		    System.out.print("<"+thr.get(i)+",3>");
		}
	}
}

/*
Output:
6
25
90
78
44
81
64
[81, 64, 25] [] [90, 78, 44]
<81,5><64,5><25,5><90,3><78,3><44,3>
*/
