package LinkedList2;

public class Q5OOPSApproch {

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

        public void deleteAtEnd(int data){
            Node newNode = new Node(data);

           if(head == null){
            head = newNode;
            return;
            } 
            Node temp  = head;
            while(temp != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }

        //display the linked list
        public void display(){
            
        }


    }
    public static void main(String[] args){
        
    }
    
}
