
import java.util.Stack;

public class builtin{
    public static void main(String[] args){
       Stack<Integer> st = new Stack<>();

       st.push(100);
       st.push(200);
       st.push(300);
       
      System.out.println("Top element: " + st.peek());
      System.out.println("Popped: " + st.pop());
      System.out.println("Is stack empty :  " + st.isEmpty());
      System.out.println("stack contents: " + st);


    }
}