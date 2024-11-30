import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        System.out.println("Pushing elements onto the stack...");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // Pop an element from the stack
        System.out.println("Popping element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // Push more elements
        stack.push(40);
        stack.push(50);

        System.out.println("Stack after pushing more elements: " + stack);

        // Pop all elements
        while (!stack.isEmpty()) {
            System.out.println("Popping: " + stack.pop());
        }

        System.out.println("Stack is now empty: " + stack);
    }
}
