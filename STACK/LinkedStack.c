#include<stdio.h>
#include <stdlib.h>

typedef struct stackNode {
	int data;
	struct stackNode* pre;
} stackNode;

stackNode* top;

int isEmput() {
	if (top == NULL) return 1;
	else return 0;
}

void push(int datas) {
	stackNode* temp = (stackNode*)malloc(sizeof(stackNode));
	temp->data = datas;
	temp->pre = top;
	top = temp;
}

int pop() {
	int data;
	stackNode* temp = top;

	if (top == NULL) {
		printf("Stack is Empty!\n");
		return 0;
	}
	else {
		data = temp->data;
		top = temp->pre;
		free(temp);
		return data;
	}
}

int main(void) {
	top = NULL;
	push(10);
	push(20);
    push(30);
	printf("%d\n", pop());
	printf("%d\n", pop());
    printf("%d\n", pop());
	return 0;
}