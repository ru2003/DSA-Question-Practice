package LinkedList2;
//2. Find the Starting Node of Loop (Important in Interviews)
/*
❌ slow == fast वाला point = loop ka starting point nahi hota!
Woh sirf meeting point hota hai.
Loop ka START aur meeting point most of the time DIFFERENT hote हैं.

Isiliye head se slow wapas le jaate हैं.
1 → 2 → 3 → 4 → 5
        ↑       ↓
        ← ← ← ←
Loop start = 3
⭐ IMPORTANT: “Meeting point हमेशा Loop Start नहीं होता”
⭐ अब REAL REASON:
Why slow = head?

Because one proven fact:

✔ Distance (head → loop-start)

=
✔ Distance (meeting-point → loop-start)

jab dono pointers 1-1 step chalें।

Ye math se prove hota hai (DSA theory),
but main tujhe example se 2 sec me samjhati hoon.

*/
public class Q11startignofLoop {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Linkedlist{
          Node head;


          public void insertAtEnd(int data){
              Node newNode = new Node(data);
              if(head == null) {
                head = newNode;
                return;
              }

              Node temp  = head;
              while(temp.next != null){
                temp = temp.next;

              }
              temp.next = newNode;

          }

          public Node findLoopStart() {
            Node slow = head;
            Node fast = head;

            //detect loop 
            while(fast != null && fast.next != null){
                slow  = slow.next;
                fast  = fast.next.next;

                if(fast == slow){
                    slow = head;

                     while(slow != fast){
                    slow = slow.next ;
                    fast = fast.next;

                }
                return slow;
                }

              
            }
             return null;

          }
         

    }
    

    public static void main(String[] args){
        Linkedlist list = new Linkedlist();
        

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40); 
        list.insertAtEnd(50);
        list.insertAtEnd(60);
        
        list.head.next.next.next = list.head.next.next;

        Node answer = list.findLoopStart();
        System.out.println("The startign of the loop is: " + answer.data);



    }
    
}
