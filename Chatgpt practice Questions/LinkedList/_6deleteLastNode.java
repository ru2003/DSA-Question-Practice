package LinkedList;
//6. Delete the last node of a linked list.

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class _6deleteLastNode {
    Node head;
    //method to delete the last node
    public void deleteLastNode() {
        if(head == null){
            System.out.println("List is already empty.");
            return;
        }
        //if the list has only 1 element
        if (head.next == null){
            head = null;
            return;
        }

        //otherwise if contains many nodes then
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        //remove the last node
        current.next = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
     
    //method to print the lined list
    public void printList() {
        Node current = head;
        while(current.next != null){
            System.out.println(current.data+ "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main (String[] args) {
        _6deleteLastNode list = new _6deleteLastNode();
    }

    
}
