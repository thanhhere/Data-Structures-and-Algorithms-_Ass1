//class Stack {
//    private class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    private Node top;
//
//    // Constructor
//    public Stack() {
//        this.top = null;
//    }
//
//    // Push operation
//    public void push(int item) {
//        Node newNode = new Node(item);
//        newNode.next = top;
//        top = newNode;
//        System.out.println("Pushed: " + item);
//    }
//
//    // Pop operation
//    public int pop() {
//        if (top == null) { // Check if stack is empty
//            System.out.println("Stack Underflow");
//            return -1;
//        }
//        int popped = top.data;
//        top = top.next;
//        return popped;
//    }
//
//    // Peek operation
//    public int peek() {
//        if (top == null) {
//            System.out.println("Stack is empty");
//            return -1;
//        }
//        return top.data;
//    }
//
//    // Check if stack is empty
//    public boolean isEmpty() {
//        return top == null;
//    }
//
//    // Main method to test the stack
//    public static void main(String[] args) {
//        Stack stack = new Stack();
//
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//
//        System.out.println("Top element: " + stack.peek());
//        System.out.println("Popped element: " + stack.pop());
//        System.out.println("Is stack empty? " + stack.isEmpty());
//    }
//}
