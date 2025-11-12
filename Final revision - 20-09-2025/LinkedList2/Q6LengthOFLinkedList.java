package LinkedList2;

public class Q6LengthOFLinkedList {


    static class Node{
        int data;
        Node next;

     Node(int data) {
        this.data = data;
        this.next = null;
     }

    }

     static class linkedList{
        Node head;

        void insertAtEnd(int data){
            Node newNode = new Node( data);

            if(head == null){
                head = newNode;
                return ;
            }

            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
         }


        
         //brute force approch to measure the length of te linked list
         int getLength(){
            int count = 0;

            Node temp  = head;
            while(temp != null){
                count++;
                temp = temp.next;
                
            }
            return count;

         }

         void display() {
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
            System.out.println();
         }

    }
    public static void main(String[] args){
        linkedList list = new linkedList();
        
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.display();

        
        System.out.println("Length of Linkedlist " + list.getLength());



    }
}
