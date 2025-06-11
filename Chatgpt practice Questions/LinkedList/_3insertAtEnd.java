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
        
      }

        //linked list class
    }
    

