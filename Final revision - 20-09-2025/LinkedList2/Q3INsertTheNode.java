package LinkedList2;
import java.util.*;
/*3. Insert a Node at the Beginning / End / Given Position */
public class Q3INsertTheNode {
     static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
     }

    static class LinkedList {
        Node head ;
        //insert at beginning
        public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        }

        public  void insertAtEnd(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return ;
            }

            Node temp = head;
            while (temp.next != null){
                temp  = temp.next;
            }
            temp.next = newNode;
        }

        //insert At given position
        public void insertAtPosition(int data, int pos){
             Node newNode = new Node(data);

             if(pos < 0 ){
                System.out.println("Invalid position !");
                return ;
             }

             if(pos == 1){
                newNode.next = head;
                head = newNode;
                return ;
             }

             Node temp = head;
             for(int i=1; i<pos-1; i++){
                temp = temp.next;
             }

             if(temp == null){
                System.out.println("Position out of range.");
                return ;
             }

             newNode.next  = temp.next;
             temp.next = newNode;
             
        }

        //display the list 
        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+ " ");
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
         list.display();

         list.insertAtBeginning(5);
         list.insertAtBeginning(2);
         list.display();

         list.insertAtPosition(99,2);
         list.insertAtPosition(78,4);
         list.display();


    }
}
