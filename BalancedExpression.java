import java.util.Stack;

public class BalancedExpression {
    
    public boolean isBalanced(String str) {
        if(str == null) 
            throw new IllegalArgumentException();
        
        Stack<Character> stack = new Stack<>();
        char stackItem;
        for(char ch: str.toCharArray()) {
            if(ch == '(' || ch == '[' || ch == '{' || ch == '<')
                stack.push(ch);

            else {
                if (stack.isEmpty())
                    return false;
                switch(ch) {
                    case ')':
                        stackItem = stack.pop();
                        if(stackItem != '(')
                            return false;
                        else
                            break;
                    
                    case ']':
                        stackItem = stack.pop();
                        if( stackItem != '[')
                            return false;
                        else 
                            break;
                    
                    case '}':
                        stackItem = stack.pop();
                        if( stackItem != '{')
                            return false;
                        else 
                            break;
                    
                    case '>':
                        stackItem = stack.pop();
                        if( stackItem != '<')
                            return false;
                        else 
                            break;  
                    default: 
                        break;
                }    
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }

}
