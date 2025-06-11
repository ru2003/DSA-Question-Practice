package LinkedList;
//3. Insert a node at the end.


class Node{
        int data;
        Node next;

        //constructor to create the node
        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }


public class _3insertAtEnd {

        Node head;//head of the list
      public void insertAtEnd(int data) {
        //create a new node with given data
        Node newNode = new Node(data);

        //If the list is empty , make the new node as head
        if(head == null) {
            head = newNode;
            return;
        }
        //else traverse till the end then add the node
        Node current = head;
        while(current.next != null) {//loop condition is very important 
            current = current.next;
        }
        //change the last node when it will be 
        current.next = newNode;

      }
        //method to print the linkedList
         public void printList() {
            Node current  = head;
            while ( current != null){ //this loop condition is very important like when u have to reaverse the whole linked list curreent != null traverse till when current.next null hota hai tab tk
                System.out.print(current.data+ "->");
                current = current.next;
            }
            System.out.println("null");
            
        }

        //linked list class
        public static void main(String[] args) {
            _3insertAtEnd list = new _3insertAtEnd();

            //inset some nodes at the end
            list.insertAtEnd(10);
            list.insertAtEnd(20);
            list.insertAtEnd(30);

            //print the linked list
            System.out.println("Linked List after insertion: ");
            list.printList();

        }
    }
    

