import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        double sum=0,size=n;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        double avg=sum/size;
        System.out.println("Average of array: "+avg);
        System.out.println("All Subsets: "+subset(arr,n));
        System.out.println("Subsets with Average: "+SubsetAvg(subset(arr,n),avg));
    }
    public static List<List<Integer>> subset(int arr[],int n){
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<>());
        for(int i=0;i<n;i++){
            int size=res.size();
            for(int j=0;j<size;j++){
                List<Integer> temp=new ArrayList<>(res.get(j));
                temp.add(arr[i]);
                res.add(temp);
            }
        }
        return res;
    }
    public static List<List<Integer>> SubsetAvg(List<List<Integer>> arr,double avg){
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<arr.size()-1;i++){
            double sum=0;
            double len=arr.get(i).size();
            for(int j=0;j<arr.get(i).size();j++){
                sum+=arr.get(i).get(j);
            }
            if((sum/len)==avg){
                res.add(arr.get(i));
            }
        }
        return res;
    }
}

/*
Output:
3
20 40 60
Average of array: 40.0
All Subsets: [[], [20], [40], [20, 40], [60], [20, 60], [40, 60], [20, 40, 60]]
Subsets with Average: [[40], [20, 60]]
*/
