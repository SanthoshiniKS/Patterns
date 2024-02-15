import java.util.*;
class Avg{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++) {
            sum+=arr[i];
        }
        double avg=(double)sum/n;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if((double)(sum-arr[i])/(n-1)==avg){
                res.add(arr[i]);
            }
        }
        if(res.size()>0)
           System.out.println(res);
        else
           System.out.println(arr);
    }
}
