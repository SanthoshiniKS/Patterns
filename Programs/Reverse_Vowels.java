import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		int ind[]=new int[s.length()];
		char v[]=new char[s.length()];
		int j=0;
		for(int i=0;i<s.length();i++){
		    char c=Character.toUpperCase(s.charAt(i));
		    if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
		        ind[j]=i;
		        v[j]=s.charAt(i);
		        j++;
		    }
		}
		 char[] charArray = s.toCharArray();
        for (int i = 0; i < j; i++) {
            charArray[ind[i]] = v[j-i-1];
        }
        s = new String(charArray); 
		System.out.println(s);
	}
}
