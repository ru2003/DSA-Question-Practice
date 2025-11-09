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

        public static void insertAtEnd(int data){
            
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

         list.insertAtPosition(99);
         list.insertAtposition(78);
         list.display();


    }
}
