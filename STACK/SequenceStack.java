package STACK;

class Stack {
    public final int STACK_SIZE = 100;
    public int[] stack = new int[STACK_SIZE];
    public int top = 0;

    public boolean isEmpty() {
        if(top == 0) {
            return true;
        }
        return false;
    }
    public boolean isFull() {
        if(top == STACK_SIZE) {
            return true;
        }
        return false;
    }
    public void push(int data) {
        if(isFull()) {
            System.out.println("Stack is Full!");
            return;
        }
        stack[top++] = data;
    }
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return stack[--top];
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