
//. Peek the top element of a stack
import java.util.Stack;
public class _4PeekTopElement {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

           stack.push(10);
           stack.push(20);
           stack.push(30);

           System.out.println("Top element is: " +stack.peek());
    
    }

    
}
