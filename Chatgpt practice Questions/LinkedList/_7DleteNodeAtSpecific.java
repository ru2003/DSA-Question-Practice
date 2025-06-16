package LinkedList;


class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class _7DleteNodeAtSpecific {

    Node head;//head of the list
    //method to delete the node at a givem position
    public void DeleteNode(int position) {
        if (head == null){
            return ;
        }
       //store head node
       Node temp = head;

       //if head needs to be removed
       if(position == 0) {
        head = temp.next;
        return;
        
       }
    }


    public static void main(String[] args) {
        
    }
    
}
