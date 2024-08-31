package Queue;

class Queue {
    private final int QUEUE_SIZE = 10;      // 큐의 크기
    private int front;      // 삭제하는 곳
    private int rear;       // 삽입하는 곳
    private int[] queue;    // 배열 큐
    private int count = 0;  // 배열안에 데이터 개수

    public Queue() {
        front = 0;
        rear = 0;
        queue = new int[QUEUE_SIZE];
    }
    // 배열이 비었는지 확인
    public boolean isEmpty() {
        if(count == 0) {
            return true;
        }
        return false;
    }
    // 배열이 가득찼는지 확인
    public boolean isFull() {
        if(count == QUEUE_SIZE) {
            return true;
        }
        return false;
    }
    // 큐에 삽입 연산
    public void enQueue(int data) {
        if(isFull()) {
            System.out.println("Queue is Full!");
            return;
        }
        queue[rear] = data;
        rear = (rear + 1) % QUEUE_SIZE;
        count = count + 1;
        return;
    }
    // 큐의 삭제 연산
    public int deQueue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        int data = queue[front];
        front = (front + 1) % QUEUE_SIZE;
        count = count - 1;
        return data;
    }
}
public class SequenceQueue {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }
}