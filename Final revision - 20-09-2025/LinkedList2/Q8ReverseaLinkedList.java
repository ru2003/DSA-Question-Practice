package LinkedList2;
//reverse a linked list ==> 3 pointer , 4 step process.
// Time Complexity : O(n)  &&& Space Complexity : O(1)
public class Q8ReverseaLinkedList {

     class Node{
       int data;
       Node next;

       Node(int data){
         this.data = data;
         this.next = null;
       }

    }

    public Node reverse(Node head){
        Node prev = null;
        Node curr  = head;
        Node nxt  = null;


        while(curr != null){
            nxt = curr.next;
            curr.next = prev;
            


        }
    }
    public static void main(String[] args){
       
        
    }
}
