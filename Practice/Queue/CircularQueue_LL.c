#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *next;
};
struct node *front=NULL,*rear=NULL;
void enqueue(int x){
    struct node *newnode;
    newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=x;
    newnode->next=NULL;
    if(front==NULL && rear==NULL){
        front=rear=newnode;
        front->next=front;
    }
    else{
        rear->next=newnode;
        rear=newnode;
        rear->next=front;
    }
}
void dequeue(){
    if(front==NULL){
        printf("Queue is empty");
    }
    else{
        struct node *temp=front;
        if (front==rear) {
            front=rear=NULL;
        }
        else{
            printf("%d\n",front->data);
            front=front->next;
            rear->next=front;   
        }
        free(temp);
    }
}
void display(){
    if(front==NULL && rear==NULL){
        printf("Queue is Empty");
    }
    else{
        struct node *temp=front;
        while(temp->next!=front){
            printf("%d -> ",temp->data);
            temp=temp->next;
        }
        printf("%d\n",temp->data);
    }
}
void peek(){
    if(front==NULL && rear==NULL){
        printf("Queue is Empty");
    }
    else{
        printf("%d\n",front->data);
    }
}
void main(){
    int ch=0;
    while(ch!=5){
        printf("1.Enqueue\n2.Dequeue\n3.Display\n4.Peek\n5.Exit\n");
        scanf("%d",&ch);
        switch(ch){
                case 1:
		            printf("Enter element to insert: ");
		            int a=0;
		            scanf("%d",&a);
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
		            printf("Exit");
		            break;
		        default:
		            printf("Invalid choice");
		            break;
        }
    }
}
/*
Output:
[?2004l
1.Enqueue
2.Dequeue
3.Display
4.Peek
5.Exit
1
Enter element to insert: 3
1.Enqueue
2.Dequeue
3.Display
4.Peek
5.Exit
1
Enter element to insert: 6
1.Enqueue
2.Dequeue
3.Display
4.Peek
5.Exit
1
Enter element to insert: 1
1.Enqueue
2.Dequeue
3.Display
4.Peek
5.Exit
3
3 -> 6 -> 1
1.Enqueue
2.Dequeue
3.Display
4.Peek
5.Exit
2
3
1.Enqueue
2.Dequeue
3.Display
4.Peek
5.Exit
3
6 -> 1
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
