/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *prev;
    struct Node *next;
};
struct Node* createNode(int data){
    struct Node *newnode=(struct Node*)malloc(sizeof(struct Node));
    if(newnode==NULL){
        printf("Memory is not allocated");
        exit(1);
    }
    newnode->prev=NULL;
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
    newnode->prev=temp;
}
void insertatMiddle(struct Node *head,int data,int pos){
    struct Node *newnode=createNode(data);
    struct Node *temp=head;
    int c=1;
    while(temp!=NULL && c!=pos-1){
        c++;
        temp=temp->next;
    }
    newnode->prev=temp;
    newnode->next=temp->next;
    temp->next=newnode;
}
struct Node* deleteatBeginning(struct Node *head){
    if(head==NULL){
        printf("Error");
        exit(1);
    }
    struct Node *temp=head;
    head=head->next;
    free(temp);
    return head;
}
void deleteatEnd(struct Node *head){
    struct Node *temp=head;
    while(temp->next!=NULL){
        temp=temp->next;
    }
    temp->prev->next=NULL;
    free(temp);
}
void deleteatMiddle(struct Node *head,int pos){
    struct Node *temp=head;
    int c=1;
    while(temp!=NULL && c!=pos-1){
        temp=temp->next;
        c++;
    }
    temp->next=temp->next->next;
    temp->next->prev=temp;
}
void display(struct Node *head){
    struct Node *temp=head;
    while(temp->next!=NULL){
        printf("%d -> ",temp->data);
        temp=temp->next;
    }
    printf("%d\n",temp->data);
}
int main()
{
    struct Node *head=NULL;
    printf("------->Insertion At Beginning<-------\n");
    head=insertatBeginning(head,4);
    head=insertatBeginning(head,5);
    display(head);
    printf("------->Insertion At End<-------\n");
    insertatLast(head,6);
    insertatLast(head,10);
    insertatLast(head,50);
    display(head);
    printf("------->Insertion At Middle<-------\n");
    insertatMiddle(head,7,2);
    insertatMiddle(head,8,4);
    display(head);
    
    //DELETION
    head=deleteatBeginning(head);
    printf("------->Delete At Beginning<-------\n");
    display(head);
    deleteatMiddle(head,3);
    printf("------->Delete At Middle<-------\n");
    display(head);
    deleteatEnd(head);
    printf("------->Delete At End<-------\n");
    display(head);
    return 0;
}
