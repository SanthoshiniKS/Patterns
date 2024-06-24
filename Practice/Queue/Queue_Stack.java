import java.util.*;
public class Main
{
    static int top1=-1,top2=-1;
    static int[] s1;
    static int[] s2;
    static int n=0;
    static int count=0;
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
	    s1=new int[n];
	    s2=new int[n];
		int ch=0;
		while(ch!=5){
		    System.out.println("1.Enqueue\n2.Dequeue\n3.Display\n4.Peek\n5.Exit");
	    	ch=obj.nextInt();
		    switch(ch){
		        case 1:
		            System.out.println("Enter element to insert: ");
		            int a=obj.nextInt();
		            enqueue(a);
		            break;
		        case 2:
		            dequeue();
		            break;
		        case 3:
		            display();
		            break;
		        case 4:
		            peek();
		            break;
		        case 5:
		            System.out.println("Exit");
		            break;
		        default:
		            System.out.println("Invalid choice");
		            break;
		    }
		}
	}
	public static void push1(int x){
	    if(top1==n-1){
	        System.out.println("Full");
	    }
	    else{
	        top1++;
	        s1[top1]=x;
	    }
	}
	public static int pop1(){
	    if(top1==-1) {
            System.out.println("Stack1 is Empty");
            return -1;
        }
        else{
	        return s1[top1--];
        }
	}
	public static void enqueue(int a){
	    push1(a);
	    count++;
	}
	public static void push2(int x){
	    if(top2==n-1){
	        System.out.println("Full");
	    }
	    else{
	        top2++;
	        s2[top2]=x;
	    }
	}
	public static int pop2(){
	    if(top2==-1) {
            System.out.println("Stack2 is Empty");
            return -1;
        }
        else{
	        return s2[top2--];
        }
	}
	public static void dequeue(){
	    if(top1==-1 && top2==-1){
	        System.out.println("Queue is Empty");
	    }
	    else{
	        for(int i=0;i<count;i++){
	            push2(pop1());
	        }
	        System.out.println(pop2());
	        count--;
	        for(int i=0;i<count;i++){
	            push1(pop2());
	        }
	    }
	}
	public static void display(){
	    if(top1==-1 && top2==-1){
	        System.out.println("Queue is Empty");
	    }
	    else{
	        System.out.println("Array Elements: ");
	        for(int i=0;i<=top1;i++){
	            System.out.print(s1[i]+" ");
	        }
	        System.out.println();
	    }
	}
	public static void peek(){
	    if(top1==-1){
	        System.out.println("Queue is Empty");
	    }
	    else{
	        System.out.println(s1[0]);   
	    }
	}
}

/*
Output:
5
1.Enqueue
2.Dequeue
3.Display
4.Peek
5.Exit
1
Enter element to insert: 
4
1.Enqueue
2.Dequeue
3.Display
4.Peek
5.Exit
1
Enter element to insert: 
3
1.Enqueue
2.Dequeue
3.Display
4.Peek
5.Exit
1
Enter element to insert: 
6
1.Enqueue
2.Dequeue
3.Display
4.Peek
5.Exit
3
Array Elements: 
4 3 6 
1.Enqueue
2.Dequeue
3.Display
4.Peek
5.Exit
2
4
1.Enqueue
2.Dequeue
3.Display
4.Peek
5.Exit
3
Array Elements: 
3 6 
1.Enqueue
2.Dequeue
3.Display
4.Peek
5.Exit
4
3
1.Enqueue
2.Dequeue
3.Display
4.Peek
5.Exit
5
Exit
*/
