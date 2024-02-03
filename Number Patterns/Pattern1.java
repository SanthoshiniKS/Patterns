import java.util.*;
class Pattern {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=obj.nextInt();
        pattern(n);
    }
    public static void pattern(int n){
        int min=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i<j)
                    min=i;
                else
                    min=j;
                System.out.print((n-min)+1);  
            }
            min=0;
            for(int j=n-1;j>=1;j--)
            {
                  if(i<j)
                    min=i;
                else
                    min=j;
                System.out.print((n-min)+1);     
            }
            System.out.println();  
        }
         for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=n;j++)
            {
                if(i<j)
                    min=i;
                else
                    min=j;
                System.out.print((n-min)+1);  
            }
            min=0;
            for(int j=n-1;j>=1;j--)
            {
                  if(i<j)
                    min=i;
                else
                    min=j;
                System.out.print((n-min)+1);   
            }
            System.out.println();
        }
    }
}

/*
Output:
Enter n: 
4
4444444
4333334
4322234
4321234
4322234
4333334
4444444

*/