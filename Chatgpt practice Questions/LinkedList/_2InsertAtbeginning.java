package LinkedList;

class Node{
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

//Linked List class
public class _2InsertAtbeginning {
    Node head;

    //method to insert a node at the beginning
    public  void insertatthebeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
}
