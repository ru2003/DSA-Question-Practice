package LinkedList;
/*12. Detect a loop in a linked list.
(Floyd’s Cycle Detection Algorithm) */

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
    

public class _12DetectLoop {

    Node head;
    //add node to front the list
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args){

    }
    
}
