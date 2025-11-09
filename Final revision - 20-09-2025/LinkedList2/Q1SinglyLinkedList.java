package LinkedList2;


public class Q1SinglyLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

       static class LinkedList{
        Node head;

     //Insert at end 
     public void insertAtEnd(int data){
        Node newNode = new Node(data);

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


     //insert at beginning
     public void insertAtbeginning(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
     }

     //delete by value
      public void deleteByValue(int value){
        if(head == null){
            return;
        }

        if(head.data == value){
            head = head.next;
            return ;
        }

        Node temp = head;
        while(temp.next != null && temp.next.data != value){
            temp = temp.next;
            
        }
        temp.next = temp.next.next;
      }

      //display list
      public void display() {
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

        list.insertAtbeginning(5);
        list.display();

        list.deleteByValue(20);
        list.display();



        
    }
}
