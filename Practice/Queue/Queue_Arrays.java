import java.util.*;
public class Main
{
    static int front=-1,rear=-1;
    static int[] arr;
    static int n=0;
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		arr=new int[n];
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
	public static void enqueue(int a){
	    if(front==-1 && rear==-1){
	        front++;rear++;
	        arr[front]=a;
	    }
	    else if(rear==n-1){
	        System.out.println("Overflow");
	    }
	    else{
	        arr[++rear]=a;
	    }
	}
	public static void dequeue(){
	    if(front==-1 && rear==-1){
	        System.out.println("Queue is Empty");
	    }
	    else if(front==rear){
	        front=rear=-1;
	    }
	    else{
	        System.out.println(arr[front]);
	        front++;
	    }
	}
	public static void display(){
	    if(front==-1 && rear==-1){
	        System.out.println("Queue is Empty");
	    }
	    else{
	        for(int i=front;i<=rear;i++){
	            System.out.println(arr[i]);
	        }   
	    }
	}
	public static void peek(){
	    if(front==-1){
	        System.out.println("Queue is Empty");
	    }
	    else{
	        System.out.println(arr[front]);   
	    }
	}
}

/*Output:
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
6
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
3
Array Elements: 
4 6 4 

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
6 4 

1.Enqueue
2.Dequeue
3.Display
4.Peek
5.Exit
4
6
1.Enqueue
2.Dequeue
3.Display
4.Peek
5.Exit
5
Exit
*/
