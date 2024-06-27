import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	    int n=obj.nextInt();
		for(int i=0;i<2*n-1;i++){
		    for(int j=0;j<2*n-1;j++){
		        int left=j,right=(2*n)-2-j,top=i,bottom=(2*n)-2-i;
		        int num=Math.min(Math.min(left,right),Math.min(top,bottom));
		        System.out.print(n-num);
		    }
		    System.out.println();
		}
	}
}
/*
Output:
4
4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 
*/
