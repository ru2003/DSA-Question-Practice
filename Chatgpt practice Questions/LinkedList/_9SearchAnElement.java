package LinkedList;
//9. Search an element in the linked list.

class Node{
    int data;
    Node next;

    public  Node(int data) {
        this.data = data;
        this.next = null;
    }
}

//method to add a new node at the front of the list
public class _9SearchAnElement {
    Node head;

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }    
    
    //1.iterative method to search an element
    public boolean SearchAnElemnt(int key) {

     Node current = head;
     while(current != null){
        if(current.data == key){
            return true;
        }
     }
     
     }


    }

}
