package LinkedList2;

public class Q5SearchforLinkedList {
    /*
     * 🪜 1️⃣ Brute Force Approach (Manual Traversal)
💡 Idea

Start from head

Traverse each node one by one

Compare node’s data with the target value

If found → print position

Else → after traversal, print “Not Found”
     */



     static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
     }
    public static void  main(String[] args){
        //create a linked list: 10-> 20-> 30->
        Node head  = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next = new Node(40);

        int key = 20;
        Node temp = head;
        int position = 1;
        boolean found = false;

        while(temp != null){
            if(temp.data == key){
                System.out.println("Element " + key + " found at position " + position);
                found = true;
                break;
            }else{
                temp = temp.next;
                position++;
            }  
        }
         if(!found){
                System.out.println("element " + key + " not found.");
            }



          
    }
}
