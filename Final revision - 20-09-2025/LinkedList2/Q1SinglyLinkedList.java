package LinkedList2;


public class Q1SinglyLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    class LinkedList{
        Node head;

     //Insert at end 
     public void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return ;
        }
        Node temp = head;
        while(temp.next == null){
            temp = temp.next;
        }
        temp.next = newNode;
     }

    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();

        list.insertAtbeginning(5);
        list.display();

        list.deleteByValue(20);
        list.display();



        
    }
}
