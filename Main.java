import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        MyStack myStack = new MyStack();
        myStack.reverseString("abcde");
//Stack
        // Stack<Integer> stack = new Stack<>();
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // System.out.println(stack);
        // var top = stack.pop();
        // System.out.println(top);
        // System.out.println(stack);
        // top = stack.peek();
        // System.out.println(top);
//Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        var top = stack.pop();
        System.out.println(top);
        System.out.println(stack);
        top = stack.peek();
        System.out.println(top);

//Linked List
        // LinkedList list = new LinkedList();
        // list.addFirst(2);
        // list.addFirst(1);
        // list.addLast(3);
        // list.addLast(4);
        // list.addLast(5);
        // // list.removeLast();
        // System.out.println(list.contains(5));
        // // System.out.println("Size Finally " + list.size());
        // list.reverseList();
        // System.out.println(Arrays.toString(list.toArray()));
        // System.out.println(list.getKthNode(-3));
        
// Arrays        
        // Array numbers = new Array(3);
        // numbers.insert(10);
        // numbers.insert(20);
        // numbers.insert(30);
        // numbers.insert(40);
        // System.out.println(numbers.indexOf(30) +".");
        // numbers.print();
        // numbers.removeAt(0);
        // numbers.print();
         
    }
}