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
	    else if((rear+1)%n==front){
	        System.out.println("Queue is Full");
	    }
	    else{
	        rear=(rear+1)%n;
	        arr[rear]=a;
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
	        front=(front+1)%n;
	    }
	}
	public static void display(){
	    if(front==-1 && rear==-1){
	        System.out.println("Queue is Empty");
	    }
	    else{
	        System.out.println("Array Elements:");
	        int i=front;
	        while(i!=rear){
	            System.out.print(arr[i]+" ");
	            i=(i+1)%n;
	        }
	        System.out.println(arr[rear]+"\n");
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
