import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String s=obj.next();
		System.out.println(HexaToBinary(s));
	}
	public static String HexaToBinary(String s){
	    HashMap<Character,String> map=new HashMap<>();
	    map.put('0',"0000");map.put('1',"0001");map.put('2',"0010");map.put('3',"0011");
	    map.put('4',"0100");map.put('5',"0101");map.put('6',"0110");map.put('7',"0111");
	    map.put('8',"1000");map.put('9',"1001");map.put('A',"1010");map.put('B',"1011");
	    map.put('C',"1100");map.put('D',"1101");map.put('E',"1110");map.put('F',"1111");
	    String res="";
	    for(int i=0;i<s.length();i++){
	        char c=Character.toUpperCase(s.charAt(i));
	        if(map.containsKey(c)){
	            res=res+map.get(c);
	        }
	    }
	    return res;
	}
}

/*
Output:
1A3F
0001101000111111
*/
