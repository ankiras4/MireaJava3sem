package Tasks.Task22;

public class Stack<S> {

    // store elements of stack
    private String arr[];
    // represent top of stack
    private int top;
    // total capacity of the stack
    private int capacity;
    // Creating a stack
    Stack(int size) {
        // initialize the array
        // initialize the stack variables
        arr = new String[size];
        capacity = size;
        top = -1;
    }
    // push elements to the top of stack
    public void push(String x) {
        if (isFull()) {
            // terminates the program
            System.exit(1);
        }
        // insert element on top of stack
        arr[++top] = x;
    }
    // pop elements from top of stack
    public String pop() {
        // if stack is empty
        // no element to pop
        if (isEmpty()) {
            // terminates the program
            System.exit(1);
        }
        // pop element from top of stack
        return arr[top--];
    }
    // return size of the stack
    public int getSize() {
        return top + 1;
    }
    // check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }
    // check if the stack is full
    public Boolean isFull() {
        return top == capacity - 1;
    }
    // display elements of stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}