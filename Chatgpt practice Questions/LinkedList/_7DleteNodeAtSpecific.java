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
       
       //find previous node of the node to be deleted
       for(int i=0; temp!=null && i<position-1;i++){
        temp = temp.next;
       }
       //if position is more that number of node
       if(temp == null || temp.next == null) {
        return;
       }
       //Node temp.next is the node to be deleted
       //store pointer to the next of node to be deleted
       Node next = temp.next.next;

       //unlike the deleted node from list
       temp.next = next;
    }

    //method to insert a new node at the front of the list
    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    //method to print the linkedlist
    public void printList() {
        Node tnode = head;
        while(tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }

    }


    public static void main(String[] args) {
        _7DleteNodeAtSpecific list = new _7DleteNodeAtSpecific();
        

        list.push(7);
        list.push(1);
        list.push(5);
        list.push(8);
        list.push(9);

        System.out.println("Created Linked list is: ");
        list.printList();

        list.DeleteNode(3);
        System.out.println("\nLinked List after Deletion at position 3: ");
        list.printList();
    }
    
}
