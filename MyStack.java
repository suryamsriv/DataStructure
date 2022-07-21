import java.util.*;
public class MyStack {
    StackM<Character> stack = new StackM();
    
    public void addToStack(String str)
    {
        int i = 0;
        while(i < str.length())
        {
            stack.push(str.charAt(i));
            i++;
        }
    }

    public void reverseString(String str) {
        addToStack(str);
        int i = 0;
        while(! stack.empty()) {
            System.out.println(stack.pop());
            i++;
        }
    }
}
