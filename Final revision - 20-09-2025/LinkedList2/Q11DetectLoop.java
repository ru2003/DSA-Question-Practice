package LinkedList2;

import LinkedList2.Q6LengthOFLinkedList.linkedList;

/*Loop एक circle है।
अगर दो लोग एक circle पर चलते हैं:

A = 1 step per round

B = 2 steps per round

तो क्या होगा?

→ तेज़ वाला slow वाले को overtake करेगा
→ यानी किसी न किसी point पर दोनों एक ही जगह मिलेंगे

This is guaranteed.

Already explained earlier.

Time: O(n)

Space: O(1)

Best method
 */
public class Q11DetectLoop {
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
            Node newNode  = new Node(data);
            if(head == null){
              head   = newNode;
              return ;
            }

            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;

        }

        //detect loop using the floyds algorithm
        public boolean detectLoop(){
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;/*
                जब loop check करते हैं, शुरुआत में slow = head और fast = head होते हैं।
Agar hum pehle hi slow == fast compare करते, to start me hi slow == fast ho jata,
aur hame galat result milta:

slow == head
fast == head
→ false loop detected!
✔ पहले pointer ko move karte hain
✔ फिर unhe compare karte hain
→ Tabhi real meeting point milta hai.
                 */
                fast = fast.next.next;
                 
                if(slow == fast){
                    return true;
                }

            }
            return false;

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

      //creating a loop : last node points to 2nd node
      list.head.next.next.next = list.head.next;

      if(list.detectLoop()){
        System.out.println("Yes Loop is detected. ");
      }else{
        System.out.println("No loop detected.");
      }
    }
    
}
