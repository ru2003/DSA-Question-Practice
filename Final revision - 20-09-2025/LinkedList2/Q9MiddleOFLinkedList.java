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

         
        public Node findtheMiddle(){
            if(head == null){
                System.out.println("LnkedList is empty. ");
                return -1;

            }
            
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;

            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

            }
            return slow.data;//slow is at the middle

        
        }
        
    }
    public static void main(String[] args){
        
    }
}
