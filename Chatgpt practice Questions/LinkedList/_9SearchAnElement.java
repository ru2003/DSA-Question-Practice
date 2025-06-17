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
        current = current.next;
     }
     return false;//elemnt not found
     
     }

     public void printlist(){
        Node current = head;
        while(current!=null){
            System.out.println(current.data+" ");
            current = current.next;
        }
     }

     public static void main(String[] args){
        _9SearchAnElement list = new _9SearchAnElement();
        System.out.println("Created Linked list is: ");
        list.printlist();

     }




    }


