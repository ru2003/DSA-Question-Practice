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
    }


    
}
