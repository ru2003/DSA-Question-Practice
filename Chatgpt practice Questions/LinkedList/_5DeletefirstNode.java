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

     //method to add nodes at the end (for testing)
     public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
   }

   public void printList(){
    Node current = head;
    while(current != null) {
        System.out.print(current.data + " -> ");
        current = current.next;
    }
    System.out.println("null");
   }



     public static void main(String[] args){
        _5DeletefirstNode list = new _5DeletefirstNode();//object of the main class

        //create a sample linked list:10->20->30->null.
        list.append(10);
        list.append(20);
        list.append(30);

        System.out.println("Original List: ");
        list.printList();
        
        //Delete the first Node
        list.deleteFirst();
        list.printList();

        //Delete first node again
        list.deleteFirst();
        System.out.println("\n after deleting first node");
        list.printList();

        //Delete first node again
        list.deleteFirst();
        System.out.println("\n after deleting first node");
        list.printList();

        //try deleteing from empty list
        list.deleteFirst();


     }

    
}
