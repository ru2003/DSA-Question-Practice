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
}
//stack class using Linked list
public class _8StackusinLinkedList {


    
}
