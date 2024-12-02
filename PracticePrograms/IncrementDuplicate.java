package javaapplication;
import java.util.*;
public class IncrementDuplicate {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.next();
        }
        System.out.println(Arrays.toString(arr));
        ArrayList<String> temp=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
                temp.add(arr[i]+map.get(arr[i]));
            }
            else{
                map.put(arr[i],0);
                temp.add(arr[i]);
            }
        }
        System.out.println(temp);
        System.out.println(map);
    }
}

/*Output:
5
switch
tv
tv
switch
tv
[switch, tv, tv, switch, tv]
[switch, tv, tv1, switch1, tv2]
{tv=2, switch=1}
*/