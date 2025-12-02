package LinkedList2;
//reverse a linked list ==> 3 pointer , 4 step process.
// Time Complexity : O(n)  &&& Space Complexity : O(1)
public class Q8ReverseaLinkedList {

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
          Node newNode =  new Node(data);

          if(head == null){
            head = newNode;
            return ;
          }

          Node temp  = head ;
          while( temp.next != null){
               temp = temp.next;
          }
          temp.next = newNode;
    }

    public void reverse(){
        Node prev = null;
        Node curr  = head;
        Node nxt  = null;


        while(curr != null){
            nxt = curr.next;
            curr.next = prev;

            prev = curr ;
            curr = nxt;
        }
        head= prev;
    }

    public  void display() {
         Node temp = head;
         System.out.println("Linked List is: ");
         while( temp != null){

            System.out.print( temp.data + " ");
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
       list.display();

       list.reverse();
       list.display();
    


       
        
    }
}
