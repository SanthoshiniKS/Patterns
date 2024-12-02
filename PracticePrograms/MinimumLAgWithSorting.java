package javaapplication;
import java.util.*;
public class MinimumLAgWithSorting {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int centers[]=new int[n];
        int dest[]=new int[n];
        for(int i=0;i<n;i++){
            centers[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++){
            dest[i]=obj.nextInt();
        }
        findMinimumDistance(centers,dest);
    }
    public static void findMinimumDistance(int c[],int d[]){
        Arrays.sort(c);
        Arrays.sort(d);
        int ans=0;
        for(int i=0;i<c.length;i++){
            ans+=Math.abs(c[i]-d[i]);
        }
        System.out.println(ans);
    }
}
