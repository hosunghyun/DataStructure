package STACK;

class Stack {
    public int data;
    public Stack pre;
    public Stack top;

    public Stack() {
        data = 0;
        pre = null;
        top = null;
    }
    public Stack(int data) {
        this.data = data;
    }

    public boolean isEmpty() {
        if(top == null) {
            return true;
        }
        return false;
    }
    public void push(int data) {
        Stack newStack = new Stack(data);
        newStack.pre = top;
        top = newStack;
    }
    public int pop() {
        int data;
        Stack newStack = top;
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return 0;
        }
        data = newStack.data;
        top = newStack.pre;
        return data;
    }
}

class LinkedStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
