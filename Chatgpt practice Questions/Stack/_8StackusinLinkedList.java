//
//8. Implement a Stack using Linked List
/*No fixed size (dynamic memory).

Efficient for push/pop (O(1) time).

Top of stack is the head of the linked list. */

//node class to represent each element in the stack

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

//stack class using linked list

class StackLinkedlist{
    Node top;

    StackLinkedlist() {
        top = null;//initiallly stack is empty
    }
    //push operation
    void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;//point to previous top
        top = newNode;
        System.out.println(value+ " pushed to stack");
    }
    //pop operation
    int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = top.data;
        top= top.next;
        return popped;
    }

    //peek operation
    int peek() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;       
        }
          return top.data;
    }
   boolean isEmpty() {
    return top == null;
   }
    //display stack elements
    void display() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return ;
        }

        System.out.println("Stack:");
        Node current = top;
        while(current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
//stack class using Linked list
public class _8StackusinLinkedList {


    
}
