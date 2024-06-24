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
		while(ch!=8){
		    System.out.println("1.Enqueue at Front\n2.Enqueue at Rear\n3.Dequeue at Front\n4.Deque at Rear\n5.Display\n6.Get front\n7.Get Rear\n8.Exit");
	    	ch=obj.nextInt();
		    switch(ch){
		        case 1:
		            System.out.println("Enter element to insert: ");
		            int a=obj.nextInt();
		            enqueuefront(a);
		            break;
		        case 2:
		            System.out.println("Enter element to insert: ");
		            int b=obj.nextInt();
		            enqueuerear(b);
		            break;
		        case 3:
		            dequeuefront();
		            break;
		        case 4:
		            dequeuerear();
		            break;
		        case 5:
		            display();
		            break;
		        case 6:
		            getfront();
		            break;
		        case 7:
		            getrear();
		            break;
		        case 8:
		            System.out.println("Exit");
		            break;
		        default:
		            System.out.println("Invalid choice");
		            break;
		    }
		}
	}
	public static void enqueuefront(int a){
	    if(front==-1 && rear==-1){
	        front++;rear++;
	        arr[front]=a;
	    }
	    else if((rear+1)%n==front){
	        System.out.println("Queue is Full");
	    }
	    else if(front==0){
	        front=n-1;
	        arr[front]=a;
	    }
	    else{
	        front--;
	        arr[front]=a;
	    }
	}
	public static void enqueuerear(int a){
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
	public static void dequeuefront(){
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
	public static void dequeuerear(){
	    if(front==-1 && rear==-1){
	        System.out.println("Queue is Empty");
	    }
	    else if(front==rear){
	        front=rear=-1;
	    }
	    else if(rear==0){
	        System.out.println(arr[rear]);
	        rear=n-1;
	    }
	    else{
	        System.out.println(arr[front]);
	        rear--;
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
	public static void getfront(){
	    if(front==-1){
	        System.out.println("Queue is Empty");
	    }
	    else{
	        System.out.println(arr[front]);   
	    }
	}
	public static void getrear(){
	    if(rear==-1){
	        System.out.println("Queue is Empty");
	    }
	    else{
	        System.out.println(arr[rear]);   
	    }
	}
}
/*
Output:
5
1.Enqueue at Front
2.Enqueue at Rear
3.Dequeue at Front
4.Deque at Rear
5.Display
6.Get front
7.Get Rear
8.Exit
1
Enter element to insert: 
4
1.Enqueue at Front
2.Enqueue at Rear
3.Dequeue at Front
4.Deque at Rear
5.Display
6.Get front
7.Get Rear
8.Exit
1
Enter element to insert: 
3
1.Enqueue at Front
2.Enqueue at Rear
3.Dequeue at Front
4.Deque at Rear
5.Display
6.Get front
7.Get Rear
8.Exit
2
Enter element to insert: 
4
1.Enqueue at Front
2.Enqueue at Rear
3.Dequeue at Front
4.Deque at Rear
5.Display
6.Get front
7.Get Rear
8.Exit
5
Array Elements:
3 4 4

1.Enqueue at Front
2.Enqueue at Rear
3.Dequeue at Front
4.Deque at Rear
5.Display
6.Get front
7.Get Rear
8.Exit
1
Enter element to insert: 
1
1.Enqueue at Front
2.Enqueue at Rear
3.Dequeue at Front
4.Deque at Rear
5.Display
6.Get front
7.Get Rear
8.Exit
5
Array Elements:
1 3 4 4

1.Enqueue at Front
2.Enqueue at Rear
3.Dequeue at Front
4.Deque at Rear
5.Display
6.Get front
7.Get Rear
8.Exit
3
1
1.Enqueue at Front
2.Enqueue at Rear
3.Dequeue at Front
4.Deque at Rear
5.Display
6.Get front
7.Get Rear
8.Exit
4
3
1.Enqueue at Front
2.Enqueue at Rear
3.Dequeue at Front
4.Deque at Rear
5.Display
6.Get front
7.Get Rear
8.Exit
6
3
1.Enqueue at Front
2.Enqueue at Rear
3.Dequeue at Front
4.Deque at Rear
5.Display
6.Get front
7.Get Rear
8.Exit
7
4
1.Enqueue at Front
2.Enqueue at Rear
3.Dequeue at Front
4.Deque at Rear
5.Display
6.Get front
7.Get Rear
8.Exit
5
Array Elements:
3 4

1.Enqueue at Front
2.Enqueue at Rear
3.Dequeue at Front
4.Deque at Rear
5.Display
6.Get front
7.Get Rear
8.Exit
8
Exit
*/
