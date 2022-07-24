import java.util.Stack;

public class QueueWithTwoStacks {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    // O(1)
    public void enqueue(int item) {
        stack1.push(item);
    }

    // O(n)
    public int dequeue() {
        if(isEmpty())
            throw new IllegalStateException();

        moveStack1To2();
            
        return stack2.pop();
    }

    private void moveStack1To2() {
        if(stack2.isEmpty()) 
            while( !stack1.isEmpty() ) 
                stack2.push(stack1.pop());
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int peek() {
        if(isEmpty())
            throw new IllegalStateException();

        moveStack1To2();
            
        return stack2.peek();
    }
}
