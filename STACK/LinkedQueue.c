#include<stdio.h>
#include <stdlib.h>

#define QUEUE_SIZE 4

typedef struct {
	int queue[QUEUE_SIZE];
	int front, rear;
} QueueType;

// 큐 생성
QueueType* createQueue() {
	QueueType* Q;
	Q = (QueueType*)malloc(sizeof(QueueType));
	Q->front = 0;	// front 초기값 설정
	Q->rear = 0;	// rear 초기값 설정
	return Q;
}
// 큐가 공백인지 확인
int isEmpty(QueueType* Q) {
	if (Q->front == Q->rear) {
		printf("Queue is Empty!");
		return 1;
	}
	return 0;
}

// 큐가 가득찼는지 확인
int isFull(QueueType *Q) {
	if (((Q->rear + 1) % QUEUE_SIZE) == Q->front) {
		printf("Queue is Full!");
		return 1;
	}
	return 0;
}

// 큐의 rear에 값을 삽입
void enQueue(QueueType* Q, int data) {
	if (isFull(Q)) return;
	Q->rear = (Q->rear + 1) % QUEUE_SIZE;
	Q->queue[Q->rear] = data;
}

// 큐의 front에 값을 삭제
int deQueue(QueueType* Q) {
	if (isEmpty(Q)) return 0;
	Q->front = (Q->front + 1) % QUEUE_SIZE;
	return Q->queue[Q->front];
}

int main(void) {
	QueueType* Q = createQueue();
	enQueue(Q, 10);
	enQueue(Q, 20);
	enQueue(Q, 30);
	printf("%d\n", deQueue(Q));
	printf("%d\n", deQueue(Q));
	printf("%d\n", deQueue(Q));
	return 0;
}