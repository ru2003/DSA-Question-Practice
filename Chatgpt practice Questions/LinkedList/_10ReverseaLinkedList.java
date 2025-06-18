package LinkedList;

class Node{
    int data;
    Node next;

    public  Node(int data){
        this.data = data;
        this.next = null;

    }
}
public class _10ReverseaLinkedList {
    Node head;

    //Add node to front of list
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    //iterative reverse method 
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;


        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    //print the linked list 
    public void printlist(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
