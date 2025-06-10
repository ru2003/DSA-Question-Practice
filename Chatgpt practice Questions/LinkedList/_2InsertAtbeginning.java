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
        Node newNode = new Node(data);//create a new node
        newNode.next = head;//link new node to current head
        head = newNode;//make new node the new head
    }

    //method to print the list
    public void printlist() {
        Node current = head;
        while(current != null){
            
        }
    }
    
}
