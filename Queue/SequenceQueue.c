#include <stdio.h>
#include <stdlib.h>  // malloc, free 사용을 위한 헤더 파일

#define QUEUE_SIZE 4  // 큐의 크기 정의

typedef struct {
    int queue[QUEUE_SIZE];
    int front, rear;
} QueueType;

// 큐 생성
QueueType* createQueue() {
    QueueType* Q = (QueueType*)malloc(sizeof(QueueType));
    if (Q == NULL) {
        printf("Memory allocation failed\n");
        exit(1);  // 메모리 할당 실패 시 종료
    }
    Q->front = 0;  // front 초기값 설정
    Q->rear = 0;   // rear 초기값 설정
    return Q;
}

// 큐가 공백인지 확인
int isEmpty(QueueType* Q) {
    return Q->front == Q->rear;
}

// 큐가 가득찼는지 확인
int isFull(QueueType* Q) {
    return ((Q->rear + 1) % QUEUE_SIZE) == Q->front;
}

// 큐의 rear에 값을 삽입
void enQueue(QueueType* Q, int data) {
    if (isFull(Q)) {
        printf("Queue is Full!\n");
        return;
    }
    Q->queue[Q->rear] = data;
    Q->rear = (Q->rear + 1) % QUEUE_SIZE;
}

// 큐의 front에 값 삭제
int deQueue(QueueType* Q) {
    if (isEmpty(Q)) {
        printf("Queue is Empty!\n");
        return -1;  // 큐가 비어있는 경우 -1 반환
    }
    int data = Q->queue[Q->front];
    Q->front = (Q->front + 1) % QUEUE_SIZE;
    return data;
}


int main(void) {
    QueueType* Q = createQueue();

    // 큐에 데이터 삽입
    enQueue(Q, 10);
    enQueue(Q, 20);
    enQueue(Q, 30);


    // 큐에서 데이터 삭제
    printf("%d\n", deQueue(Q));
    printf("%d\n", deQueue(Q));
    printf("%d\n", deQueue(Q));

    return 0;
}