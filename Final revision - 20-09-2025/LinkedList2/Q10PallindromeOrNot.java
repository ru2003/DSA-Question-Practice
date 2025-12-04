package LinkedList2;
/* class Node { ... }
class LinkedList {

    Node head;

    insertAtEnd() { ... }

    reverse() { ... }

    isPalindrome() { ... }

    display() { ... }

}
*/
public class Q10PallindromeOrNot {
     

    static class Node{
          int data;
          Node next;

          Node(int data){
             this.data = data;
             this.next = null;
          }
    }

    //linkedlist
    static class LinkedList{
        Node head;

        public void insertAtEnd(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return ;
            }

            Node temp  = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        
        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        //reverse a linked list
        private Node reverse(Node head){
             Node prev = null;
             Node curr = head;
             Node next = null;

             while(curr != null){
               next = curr.next;
               curr.next = prev;
               prev = curr;
               curr = next;
             }
             return prev;
        }

        public boolean isPallindrome(){

            if(head == null || head.next == null){
                return true;
            }
            // to find the middle
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                slow =slow.next;
                fast = fast.next.next;
            }
             
            Node secondhalf = reverse(slow);

            //compare both 
            Node first  = head ;
            Node second  = secondhalf;
            

            while(second != null){
                if(first.data != second.data){
                    return false;
                }
               first = first.next;
               second  = second.next;
            }
            return true;
        }

    }


     
    public static void main(String [] args){
        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
         list.insertAtEnd(30);
        list.insertAtEnd(20);
        list.insertAtEnd(10);
     
        list.display();
        if(list.isPallindrome()){
            System.out.println("Yes  Linkedlist is pallindrome");

        }else{
            System.out.println("No , Linked list is not pallindrome.");
        }
        

    }
}
