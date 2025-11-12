package LinkedList2;
/*
 * ⚡ Optimized Approach (if length needed frequently)

If you’re doing many insert/delete/search operations and need the length often,
you can store the length as a variable and update it on every insert/delete — instead of traversing each time.
 */
public class Q6OOPSbasedApproch {

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
       int size;
         
       void insertAtend(int data){
        Node newNode = new Node(data);

        if(head  == null){
            head = newNode;
        }else {
            Node temp  = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
       }
        void deleteAtEnd(){
           if(head == null){
            return;
           } 
           if(head.next == null){
            head = null;
           }else{
            Node temp = head;
            while(temp.next.next != null){
                 temp = temp.next;
            }
            temp.next = null;
           }
           size--;
       }
        public int getlength(){
           return size; 
        }


        public void display() {
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
         LinkedList list = new LinkedList();

         list.insertAtend(10);
          list.insertAtend(20);
           list.insertAtend(30);
            list.insertAtend(40);
            
            list.display();
            System.out.println("The length of a linked List " + list.getlength());
    }
}
