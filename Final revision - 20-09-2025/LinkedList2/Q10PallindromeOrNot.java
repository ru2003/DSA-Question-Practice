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
            while(temp != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }


     
    public static void main(String [] args){

    }
}
