package LinkedList;
//add in the middle of the linked list
public class AddinthMiddle {

    public static class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
      public static Node head;
      public static Node tail;
    
      public void addFirstnode (int data) {
        
        //step1 == create new node
        Node newNode = new Node(data);//Node =class ka nam , newNode=>object ka nam 
        
        if(head == null) {//agr existing linked list null ho and usme hame new nodeat starting add krna hoto uske liye ye condition hoti hain .
            head = tail = newNode;
            return;
        }
        //ste 2: newnode next =head ==>starting me add krna hain.
        newNode.next = head; //link
        
        //step 3 = head =newnode
        head = newNode;
      }
      
    
      public void addLast(int data) {
          Node newNode = new Node(data);
          if(head == null) {
            head = tail = newNode;
            return;
          }
          tail.next = newNode;
          tail = newNode;
          }
    
          public void print() {
            if(head == null) {
                System.out.println("LL is empty");
                return;
            }
            Node temp = head;//becoz of therse lines we can print the linked list.
            while(temp != null) {
                System.out.print(temp.data+"-> ");
                temp = temp.next;
    
            }
            System.out.println("null");
          }

          public void add(int idx, int data) {
            Node newNode = new Node(data);
            Node temp = head;
            int i=0;
          }
    
    
        public static void main(String[] args) {
            AddFirst ll = new AddFirst();
            ll.print();
            ll.addFirstnode(2);
            ll.print();
            ll.addFirstnode(1);
            ll.print();
            ll.addLast(3);
            ll.print();
            ll.addLast(4);
            ll.print();
        
        }
    
}
