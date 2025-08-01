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
        while(current != null){
            System.out.print(current.data+ "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main (String[] args) {
        _6deleteLastNode list = new _6deleteLastNode();

        //create sample list: 10->20->30->null

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        System.out.println("Original List: ");
        list.printList();

        //Delete last node
        list.deleteLastNode();
        System.out.println("\nafter deleting last node:");
        list.printList();

        //delete last node again
        list.deleteLastNode();
        System.out.println("\nAfter deleting last node again: ");
        list.printList();

        //delete last node again
        list.deleteLastNode();
        System.out.println("\nAfter deleting last node again: ");
        list.printList();

         //delete last node again
        list.deleteLastNode();
        System.out.println("\nAfter deleting last node again: ");
        list.printList();
        
         //delete last node again
        list.deleteLastNode();
        System.out.println("\nAfter deleting last node again: ");
        list.printList();

    }

    
}
