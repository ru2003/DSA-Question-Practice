package LinkedList2;

public class Q9MiddleOFLinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList{
        Node head;

        public void insertAtEnd(int data){
            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
                return;
            }

            Node temp = head;

        }
        
    }
    public static void main(String[] args){
        
    }
}
