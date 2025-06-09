package LinkedList;
/* a linked list is a linear data structure where elements (called 
 * nodes) are stored in separate objects , and each node containd : 
 * 1.Data-> a value stored in node.
 * 2.pointer->a reference to the next node in the sequence.
 * 
 * unlike arrays ,linked lists do not store elements in the contiguous memory locations.
 * ==> this allows for efficient insertions and deletions but makes access time slowe (no indexing like arrays.)
*/

  // Node class definition
class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class CreateLinkedList {
    Node head;

    //insert at end
    public void append(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next != null) {
            current = current.next;
        }

        current.next = newNode;

        //print the list
        
        
    }
    public void printList() {
            Node current = head;
            while(current != null) {
                System.out.print(current.data + "  ->");
                current = current.next;
            }
            System.out.println("null");
        }


        public static void main(String[] args){
            CreateLinkedList list = new CreateLinkedList();

            list.append(10);
            list.append(20);
        }

}
