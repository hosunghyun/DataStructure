#include<stdio.h>

#define STACK_SIZE 100

int STACK[STACK_SIZE];
int top = 0;

// 스택이 공백인지 확인
int isEmpty() {
    if (top == 0) return 1;     // top이 0이므로 현재 스택은 공백상태
    else return 0;
}

// 스택이 가득찼는지 확인
int isFull() {
    if (top == STACK_SIZE) return 1;    // top이 스택의 크기랑 같으면 가득찬 상태이다.
    else return 0;
}

// 스택에 삽입
void push(int data) {
    if (isFull() == 1) {    // 가득찼기 때문에 스택에 값을 넣을 수 없다.
        printf("STACK is FULL\n");
        return;
    }
    else {
        STACK[top++] = data;    // 스택에 값을 넣을 수 있기 때문에 top에 값을 넣고 top을 1 증가 시킨다.
    }
}

// 스택에 삭제
int pop() {
    if (isEmpty() == 1) {       // 스택이 비었기 때문에 값을 반환할 수 없다.
        printf("STACK is Empty\n");
        return 0;
    }
    else {
        return STACK[--top];    // top이 값을 가리키기 위해 1을 감소시키고 출력
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