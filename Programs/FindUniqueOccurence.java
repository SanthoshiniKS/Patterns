import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n1=obj.nextInt();
		String A[]=new String[n1];
		for(int i=0;i<n1;i++){
		    A[i]=obj.next();
		}
		System.out.println(uniqueOccurence(A));
	}
	public static String uniqueOccurence(String arr[]){
	    ArrayList<String> notUnique=new ArrayList<>();
	   for(int i=0;i<arr.length;i++){
	       int flag=1;
	       for(int j=i+1;j<arr.length;j++){
	           if(arr[i].equals(arr[j])){
	                notUnique.add(arr[i]);
	                flag=0;
	                break;
	           }
	       }
	       if(flag==1 && !(notUnique.contains(arr[i]))){
	           return arr[i];
	       }
	   }
	   return "";
	}
}
/*
Output:
6
AL AL GH F GH PK
F
*/
