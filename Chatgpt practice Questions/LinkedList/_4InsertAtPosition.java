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

     //teaverse to the node before the insertion point
     Node current=head;
     for(int i=0;i<position-1 && current != null ; i++)

     }


    public static void main(String[] args){

    }
    
}
