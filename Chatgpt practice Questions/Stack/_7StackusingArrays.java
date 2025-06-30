
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
    }
}
public class _7StackusingArrays {
    
}
