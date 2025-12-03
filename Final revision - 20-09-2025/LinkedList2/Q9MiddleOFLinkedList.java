package LinkedList2;
/*
leetcode type answer;
class solution {
public ListNode middleNode(ListNode head){
 Listnode slow = head;
 Listnode fast= head;
 while(fast != null && fast.next != null){
 slow = slow.next;
 fast = fast.next.next;
 
 }
 return slow;


}}
 */
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
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;

        
        
        }

         
        public Node findtheMiddle(){
            if(head == null){
                System.out.println("LnkedList is empty. ");
                return null;

            }
            
           

            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

            }
            return slow;//slow is at the middle

        
        }

        public void display() {
            Node temp  = head;
            while(temp != null){
                System.out.print( temp.data +" ");
                temp = temp.next;
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
         list.insertAtEnd(20);
         list.insertAtEnd(30);
         list.insertAtEnd(40);
         list.insertAtEnd(50);
         list.insertAtEnd(60);
         list.insertAtEnd(70);

         list.display();
        
         Node  mid = list.findtheMiddle();//agr node return kr rhe hai toh pura node retunr hoga .if u want to return the dat then convert and ask for data
         System.out.println("Middle of linkedlist: " +mid.data);
        
    }
}
