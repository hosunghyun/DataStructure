#include<stdio.h>

#define STACK_SIZE 100

int STACK[STACK_SIZE];
int top = 0;

// 스택이 공백인지 확인
int isEmpty() {
    if (top == 0) return 1;
    else return 0;
}

// 스택이 가득찼는지 확인
int isFull() {
    if (top == STACK_SIZE) return 1;
    else return 0;
}

// 스택에 삽입
void push(int data) {
    if (isFull() == 1) {
        printf("STACK is FULL\n");
        return;
    }
    else {
        STACK[top++] = data;
    }
}

// 스택에 삭제
int pop() {
    if (isEmpty() == 1) {
        printf("STACK is Empty\n");
        return 0;
    }
    else {
        return STACK[--top];
    }
}

int main(void) {
    push(10);
    push(20);
    push(30);
    printf("%d", pop());
    printf("%d", pop());
    printf("%d", pop());
    return 0;
}