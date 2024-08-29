package STACK;

class Stack {
    public final int STACK_SIZE = 100;      // 스택의 최대 크기를 정해준다.
    public int[] stack = new int[STACK_SIZE];   // 스택의 최대 크기만큼 배열을 생성한다.
    public int top = 0;     // top을 설정한다.

    public boolean isEmpty() {      // 스택이 비었는지 확인
        if(top == 0) {      // top이 0이기 때문에 스택은 비었다.
            return true;
        }
        return false;
    }
    public boolean isFull() {   // 스택이 가득 찼는지 확인
        if(top == STACK_SIZE) {     // top이 스택의 크기와 같기 때문에 가득 찼다.
            return true;
        }
        return false;
    }
    public void push(int data) {
        if(isFull()) {      // 가득 찼으면 true가 반환 되기에 중괄호 실행
            System.out.println("Stack is Full!");
            return;
        }
        stack[top++] = data;    // 스택 top 위치에 data를 넣고 top은 1 증가
    }
    public int pop() {
        if(isEmpty()) {     // 스택이 비었으면 true를 반홚여 중괄호 실행
            System.out.println("Stack is Empty!");
            return -1;
        }
        return stack[--top];    // 스택의 top 위치에 값을 반환 top은 1 감소
    }
}

class SequenceStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}