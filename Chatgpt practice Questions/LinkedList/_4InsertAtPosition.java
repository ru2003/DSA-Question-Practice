package LinkedList;


class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class _4InsertAtPosition {
     Node head;
     
     //insert a node at specific position
     public void inserttheNodeAtPosition(int data , int position){ 
        Node newNode = new Node(data);  
        
     //if position is 0,insert at head   
    if(position == 0){
        newNode.next = head;
        head = newNode;
        return;
     }

     //traverse to the node before the insertion point
     Node current=head;
     for(int i=0;i<position-1 && current != null ; i++ ){
        current = current.next;
     }

     //if position is beyond the list of length insert at end 
     if(current == null) {
        insertAtEnd(data);
        return;
     }

     //insert new node ***** actual insertion
     newNode.next = current.next;
     current.next = newNode;

     }

     //helper method to insert at the end 
     public void insertAtEnd(int data){
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

     //method to print the linkedlist
     public void printList(){
        Node current = head;
        while(current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
     }




    public static void main(String[] args){
        _4InsertAtPosition list = new _4InsertAtPosition();

        //create initial list
        list.insertAtEnd(10);
         list.insertAtEnd(20);
          list.insertAtEnd(30);

          System.out.println("Original List: ");
          list.printList();

          //iinsert at position 1
          list.inserttheNodeAtPosition(15,1);
          System.out.println("\n After inserting 15 at position 1: ");
          list.printList();

          //insert at position 0
          list.inserttheNodeAtPosition(5,0);
          System.out.println("\nAfter inserting 5 at position 0: ");
          list.printList();

          //insert at position 5 
          list.inserttheNodeAtPosition(40,5);
          System.out.println("\n After inserting 40 at position 5 ");
          list.printList();

         


    }
    
}
