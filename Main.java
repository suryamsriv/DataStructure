import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {
        public static void main(String[] args) {

                BinaryTree tree = new BinaryTree();
                tree.insert(7);
                tree.insert(4);
                tree.insert(9);
                tree.insert(1);
                tree.insert(6);
                tree.insert(8);
                tree.insert(10);
                // System.out.println(tree.find(1));
                // tree.traversePostOrder();

                // System.out.println("height: " + tree.height());
                // System.out.println("min: " + tree.min());
                // var list = tree.getNodesAtDistance(2);
                // for (var item : list)
                // System.out.println(item);

                tree.traverseLevelOrder();
                // HashMap implementation
                // MyHashTable table = new MyHashTable();
                // table.put(6, "A");
                // table.put(8, "B");
                // table.put(11, "C");
                // table.put(6, "A+");
                // table.remove(6);
                // System.out.println(table.get(6));

                // HashSet: Finding first repeating character
                // FirstRepeatingChar obj = new FirstRepeatingChar();
                // System.out.println(obj.firstRepeatingCharacter("a green apple"));

                // HashTable: Finding first not repeating character
                // FirstNonRepeatingChar str = new FirstNonRepeatingChar("a green apple");
                // System.out.println(str.findFirstNonRepeatingChar("a ggreen apple"));

                // PriorityQueue pq = new PriorityQueue();
                // pq.pEnqueue(10);
                // pq.pEnqueue(30);
                // pq.pEnqueue(20);
                // pq.pEnqueue(15);
                // System.out.println(pq);
                // while(! pq.isEmpty()) {
                // System.out.println(pq.remove());
                // }

                // Q with 2 stacks
                // QueueWithTwoStacks queue = new QueueWithTwoStacks();
                // queue.enqueue(10);
                // queue.enqueue(20);
                // queue.enqueue(30);
                // queue.dequeue();
                // var first = queue.dequeue();
                // System.out.println(first);
                // MyQueue que = new MyQueue();
                // que.enqueue(10);
                // que.enqueue(20);
                // que.enqueue(30);
                // System.out.println(que);
                // System.out.println(que.dequeue());
                // System.out.println(que.dequeue());
                // System.out.println(que.dequeue());
                // System.out.println(que.dequeue());
                // System.out.println(que);

                // //M implementation of reversing a queue using array
                // Queue<Integer> queue = new ArrayDeque<>();
                // queue.add(10);
                // queue.add(20);
                // queue.add(30);
                // queue.add(40);
                // System.out.println("Original: " + queue);
                // new MyQueue().reverse(queue);
                // System.out.println("Reversed: " + queue);

                // M implementation of Stack using array
                // StackM stack = new StackM();
                // stack.push(10);
                // stack.push(20);
                // stack.push(30);

                // System.out.println(stack.peek());

                // M implementation if brackets are balanced or not
                // Expression exp = new Expression();
                // System.out.println(exp.isBalanced("([]<{}{}><><><><><>.1+2)"));

                // Checking if brackets are balanced or not
                // BalancedExpression be = new BalancedExpression();
                // Boolean b = be.isBalanced("([]<1+>2)");
                // if(b)
                // System.out.println("Balanced");
                // else
                // System.out.println("NOT Balanced");

                // M implementation for Reversing the string
                // StringReverser reverser = new StringReverser();
                // var result = reverser.reverse("input");
                // System.out.println(result);

                // MyStack myStack = new MyStack();
                // myStack.reverseString("abcde");
                // Stack
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

                // Linked List
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