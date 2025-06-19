package LinkedList;
//11. Find the middle of the linked list.
//(Use slow and fast pointer approach)


class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class _11MiddleofLinkedList {
    Node head;

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //find the middle node using slow and fast pointer
    public Node findMiddle() {
        if(head == null){
            return null;
        }

        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }

    //print the element of the linked list
    public void printlist() {
        Node current = head;
    }
    

    public static void main(String[] args) {



    }
}
