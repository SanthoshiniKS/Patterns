#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node *prev;
    struct Node *next;
};

struct Node* createNode(int data) {
    struct Node *newNode = (struct Node*)malloc(sizeof(struct Node));
    if (newNode == NULL) {
        printf("Memory allocation failed.\n");
        exit(1);
    }
    newNode->data = data;
    newNode->prev = NULL;
    newNode->next = NULL;
    return newNode;
}

struct Node* insertatBeginning(struct Node *head, int data) {
    struct Node *newNode = createNode(data);
    if (head == NULL) {
        newNode->prev = newNode;
        newNode->next = newNode;
        return newNode;
    }
    newNode->next = head;
    newNode->prev = head->prev;
    head->prev->next = newNode;
    head->prev = newNode;
    return newNode;
}

struct Node* insertatMiddle(struct Node *head, int data, int pos) {
    struct Node *newNode = createNode(data);
    if (head == NULL || pos <= 1) {
        printf("Invalid position.\n");
        return head;
    }
    struct Node *current = head;
    int count = 1;
    while (count < pos - 1 && current->next != head) {
        current = current->next;
        count++;
    }
    if (count < pos - 1) {
        printf("Invalid position.\n");
        return head;
    }
    newNode->next = current->next;
    newNode->prev = current;
    current->next->prev = newNode;
    current->next = newNode;
    return head;
}

struct Node* insertatLast(struct Node *head, int data) {
    struct Node *newNode = createNode(data);
    if (head == NULL) {
        newNode->prev = newNode;
        newNode->next = newNode;
        return newNode;
    }
    newNode->next = head;
    newNode->prev = head->prev;
    head->prev->next = newNode;
    head->prev = newNode;
    return head;
}

// Function to delete the first node of the doubly circular linked list
struct Node* deleteatBeginning(struct Node *head) {
    if (head == NULL) {
        printf("List is empty.\n");
        return NULL;
    }
    struct Node *temp = head;
    if (head->next == head) {
        free(temp);
        return NULL;
    }
    head->prev->next = head->next;
    head->next->prev = head->prev;
    head = head->next;
    free(temp);
    return head;
}

struct Node* deleteatEnd(struct Node *head) {
    if (head == NULL) {
        printf("List is empty.\n");
        return NULL;
    }
    struct Node *temp = head->prev;
    if (head->next == head) {
        free(temp);
        return NULL;
    }
    temp->prev->next = head;
    head->prev = temp->prev;
    free(temp);
    return head;
}

struct Node* deleteatMiddle(struct Node *head, int pos) {
    if (head == NULL) {
        printf("List is empty.\n");
        return NULL;
    }
    struct Node *current = head;
    int count = 1;
    while (count < pos && current->next != head) {
        current = current->next;
        count++;
    }
    if (count != pos) {
        printf("Invalid position.\n");
        return head;
    }
    if (current == head) {
        return deleteatBeginning(head);
    }
    if (current->next == head) {
        return deleteatEnd(head);
    }
    current->prev->next = current->next;
    current->next->prev = current->prev;
    free(current);
    return head;
}

// Function to display the doubly circular linked list
void display(struct Node *head) {
    if (head == NULL) {
        printf("List is empty.\n");
        return;
    }
    struct Node *current = head;
    do {
        printf("%d->", current->data);
        current = current->next;
    } while (current->next!= head);
    printf("%d\n",current->data);
}

int main() {
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
