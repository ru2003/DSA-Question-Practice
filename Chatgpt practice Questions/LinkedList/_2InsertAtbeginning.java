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
            System.out.print(current.data + "-> ");
            current = current.next;
        }
        System.out.println("null");
    }
    //main method
    public static void main(String[] args){
        
        _2InsertAtbeginning list = new _2InsertAtbeginning();

        list.insertatthebeginning(30);
         list.insertatthebeginning(40);
          list.insertatthebeginning(50);

          list.printlist();

        }
    
}
