package Stack;
//1. Push, Pop, and Top in Stack
//(Implement these functions manually using array or list) 
import java.util.Stack;
public class _1OperationsonStack {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: "+stack.peek());

        stack.pop();
        System.out.println("Top aafter pop: " + stack.peek());

        stack.pop();
        //stack.pop();

        if(stack.isEmpty()){
            System.out.println("Stack is empty.");
        }else{
            System.out.println("Stack is not empty:");
        }

    }
    
}
