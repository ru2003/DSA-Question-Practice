
// 2. Check if Stack is Empty
import java.util.Stack;
public class _2IfisEmpty {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        if(stack.isEmpty()){
          System.out.println("Stack is empty.");
        }
        stack.push(10);
        if(!stack.isEmpty()) {
            System.out.println("Stack is not empty.");
        }
    }
    
}
