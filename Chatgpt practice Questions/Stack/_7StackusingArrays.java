
// Basic Stack Implementation in Java (Using Arrays)


class Stack{
    int maxsize;
    int[] stackArray;
    int top;
    
    //constructor
    Stack(int size){
        maxsize = size;
        stackArray = new int[maxsize];
        top = -1;
    }

    //push element onto stack
    void push(int value) {
        if(top == maxsize-1){
            System.out.println("Stack Overflow");
            return;
        }
       stackArray[++top] = value;
       System.out.println(value+" pushed to stack");
    }

    //pop elment from stack
    int pop() {
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stackArray[top--];
    }

    //peek at the top elment
    int peek() {
        if(isEmpty()) {
            System.out.println("Stack is Empty: ");
            return -1;
        }
        return stackArray[top];
    }


    //peek if stack is empty
    boolean isEmpty() {
        return top == -1;
    }

    //display stack elment
    void display() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack: ");
        for(int i=0;i<=top;i++){
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}
public class _7StackusingArrays {

    public static void main(String args[]){
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);//output stack: 10 20 30 40
        stack.display();

        System.out.println("Top: " + stack.peek());

        stack.pop();
        stack.display();
        stack.pop();
        stack.display();


    }
    
}
