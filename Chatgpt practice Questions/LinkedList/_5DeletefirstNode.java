package LinkedList;

//5. Delete the first node of a linked list.

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class _5DeletefirstNode {
     Node head;

     //method to delete the first Node
     public void deleteFirst() {
        //if the list is empty do nothing
        if(head == null){
            System.out.println("List is already empty.");
        }
        //move head to the next node
        head = head.next;
     }

    
}
