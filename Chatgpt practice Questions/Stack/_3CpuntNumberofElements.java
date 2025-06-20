package Stack;
//3. Count the number of elements in a stack
import java.util.Stack;
public class _3CpuntNumberofElements {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Total elements: " + stack.size());
    }
}
