import java.util.*;
class Pattern {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        int k=1,temp=1;
        for(int i=0;i<n;i++){
           
            temp=temp+i;
            k=temp;
            System.out.print(temp+" ");
            for(int j=2;j<=n;j++){
                if((i+j)<=n){
                    k=k+(i+j);
                    System.out.print(k+" ");
                }
                else{
                    k=k+2*n-(i+j)+1;
                    System.out.print(k+" ");
                }
            }
            System.out.println();
        }
    }
}

/*
Output:
5
1 3 6 10 15 
2 5 9 14 19 
4 8 13 18 22 
7 12 17 21 24 
11 16 20 23 25 
*/
