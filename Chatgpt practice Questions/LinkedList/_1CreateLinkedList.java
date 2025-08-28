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
class Node { //have to write this code in every linked list 
    int data;
    Node next;

    // Constructor ==> to initilize the Node objects when it is created
    /*1)avoid repetitive code
    2)ensures each node is properly initilized when its created
    3)improve readibility and maintainibility
     * 
     */
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class _1CreateLinkedList {
    Node head;

    //insert at end
    public void append(int data) { //==>this method is used to insert a node at the end of the linked list
        Node newNode = new Node(data); //this create a new node with a value *data*
        if(head == null) {
            head = newNode;
            return;
        }

        Node current = head;/* current like a temporary pointer or a marker that helps us move through the list one node at time . */
        while(current.next != null) { // keep moving current to the next node until u reach to the last one and how will u understand that u reached to the last node that==> it represent null next 
            current = current.next;//jab tak he while loop chalta rahega current ki position current.next ho jayegi 
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
            _1CreateLinkedList list = new _1CreateLinkedList();//this creates a bew object of the createLinkedList class,
            //think of it like creating an empty linked list s

            list.append(10);
            list.append(20);
            list.append(30);

            list.printList();
        }

}
