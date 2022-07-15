import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        // list.removeLast();
        System.out.println(list.contains(5));
        // System.out.println("Size Finally " + list.size());
        list.reverseList();
        System.out.println(Arrays.toString(list.toArray()));
        
        
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