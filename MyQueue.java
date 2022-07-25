import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class MyQueue {
    private int front;
    private int rear;
    private int[] array = new int[5];

    public void enqueue(int item) {
        if(isFull()) 
            throw new IllegalStateException();
        array[rear++] = item;
    }

    public int dequeue() {
        if(isEmpty())
            throw new IllegalStateException();
        return array[front++];
    }

    public int peek() {
        return array[front];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return rear == array.length-1;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while( !queue.isEmpty())
            stack.push(queue.remove());
        
        while( !stack.isEmpty())
            queue.add(stack.pop());

    }
}
