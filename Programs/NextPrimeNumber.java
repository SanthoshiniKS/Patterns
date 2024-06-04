import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int isnext=1;
		while(isnext==1){
		    n=n+1;
		    for(int i=2;i<=n/2;i++){
		        if(n%i==0){
		            isnext=0;
		            break;
		        }
		    }
		    if(isnext==1){
		        System.out.println(n);
		        return;
		    }
		    else{
		        isnext=1;
		    }
		}
	}
}

/*
Output:
15
17
*/
