/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *next;
};
struct Node* createNode(int data){
    struct Node *newnode=(struct Node*)malloc(sizeof(struct Node));
    if(newnode==NULL){
        printf("Memory is not allocated");
        exit(1);
    }
    newnode->data=data;
    newnode->next=NULL;
    return newnode;
}
struct Node* insertatBeginning(struct Node *head,int data){
    struct Node *newnode=createNode(data);
    newnode->next=head;
    head=newnode;
    return head;
}
void insertatLast(struct Node *head,int data){
    struct Node *newnode=createNode(data);
    struct Node *temp=head;
    while(temp->next!=NULL){
        temp=temp->next;
    }
    temp->next=newnode;
}
void insertatMiddle(struct Node *head,int data,int pos){
    struct Node *newnode=createNode(data);
    struct Node *temp=head;
    int c=1;
    while(temp!=NULL && c!=pos-1){
        c++;
        temp=temp->next;
    }
    newnode->next=temp->next;
    temp->next=newnode;
}
void display(struct Node *head){
    struct Node *temp=head;
    while(temp->next!=NULL){
        printf("%d -> ",temp->data);
        temp=temp->next;
    }
    printf("%d",temp->data);
}
int main()
{
    struct Node *head=NULL;
    head=insertatBeginning(head,4);
    head=insertatBeginning(head,5);
    insertatLast(head,6);
    insertatMiddle(head,7,2);
    insertatMiddle(head,8,4);
    display(head);
    return 0;
}
